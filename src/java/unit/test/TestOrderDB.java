    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package unit.test;

    /**
     *
     * @author Dewan Laptop
     */

    import java.sql.*;
    import java.util.*;
    import java.util.logging.*;
    import Model.Order;
    import DAO.*;
import Model.Product;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;



    public class TestOrderDB {
        
        private static Scanner in = new Scanner(System.in);
        private DBConnector connector;
        private Connection conn;
        private DBManager db;
        
        public static void main(String[] args) throws SQLException{
        
            (new TestOrderDB()).runQueries();
        }
        
        public TestOrderDB(){
            try {
                connector = new DBConnector();
                conn = connector.openConnection();
                db = new DBManager(conn);
            }catch (ClassNotFoundException | SQLException ex){
                Logger.getLogger(TestOrderDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        @Test
        public void A_testShowOrders () throws SQLException{
            ArrayList<Order> orderlist = db.fetchOrders();
            int list_count = orderlist.size();
            int table_count = db.countOrders();
            assertEquals(list_count , table_count);
        }
        
        //This reads in the decision that is being tested
        private char readChoice(){ 
            System.out.print("Operation CRUDS or * to exit: ");
            return in.nextLine().charAt(0); //only taking the first letter of whatever is entered
        }
        
        
        // Giving all the options avaliable and following throw whatever was read above as the chosen choice
        private void runQueries() throws SQLException{ 
            char c;
            while((c = readChoice()) != '*'){
                switch(c){
                    case 'C':
                        testAdd();
                        break;
                        
                    case 'R': ;
                        testRead();
                        break;
                    case 'U': 
                        testUpdate();
                        break;
                    case 'D': ;
                        testDelete();
                        break;
                    case 'S':
                        showAll();
                        break;
                    default:
                        System.out.println("Unknown Command");
                        break;
                        }
                }
            }
        
        //adds in an order to the database
        private void testAdd(){ 

            System.out.print("Order ID: ");
            int ORDERID = in.nextInt();
            
            
            System.out.print("Product name: ");

            String PRODUCTNAME = in.nextLine();
            in.nextLine();
            
            System.out.print("Enter Product ID: ");
            int PRODUCT_ID = in.nextInt();
            in.nextLine();
            
            System.out.print("Enter price: ");
            double PRICE = in.nextDouble();


            try{
                db.addOrder(ORDERID,  PRODUCTNAME, PRODUCT_ID, PRICE);
            }catch (SQLException ex){
                Logger.getLogger(TestOrderDB.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Order added to the database.");
        }
    
        
        //reads out the all of the variables for the specific order PRODUCTNAME ORDERID PRODUCTID PRICE
        private void testRead() throws SQLException{ 
            System.out.println("Order ID: ");
            int ORDERID= in.nextInt();
            Order order = db.findOrder(ORDERID);
            if(order != null){
                System.out.println("Order " + order.getORDERID() + "exists in the database.");
            }else{
                System.out.println("Order number doesn't exists in the database.");
            }
        }

        
        //Allows you to update any of the following variables of the order on the database PRODUCTNAME ORDERID PRODUCTID PRICE
        private void testUpdate(){ 
            System.out.print("Order ID: ");
            int ORDERID = in.nextInt();
            

            try {
                if(db.checkORDERID(ORDERID)){
                    System.out.print("Enter Order ID: ");
                    ORDERID= in.nextInt();
                    in.nextLine();
                    System.out.print("Enter Product name: ");
                    String PRODUCTNAME= in.nextLine();
                    
                    System.out.print("Enter Product ID: ");
                    int PRODUCT_ID= in.nextInt();
                    in.nextLine();
                    
                    System.out.print("Enter Price: ");
                    double PRICE= in.nextDouble(); 

                    db.updateOrder(ORDERID,PRODUCTNAME, PRODUCT_ID, PRICE);
                }else{
                    System.out.print("Order does not exist");
                }

            } catch (SQLException ex){
                Logger.getLogger(TestOrderDB.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        //Allows you to delete the order using the orderid 
        private void testDelete(){ 
            System.out.print("Enter Order ID: ");
            int ORDERID = in.nextInt();
                
            
            try {
                if(db.checkORDERID(ORDERID)){
                    System.out.println("YES EXISTS");
                    db.deleteOrder(ORDERID);
                }else{
                    System.out.println("Order does not exist");
                }

            } catch (SQLException ex){
                Logger.getLogger(TestOrderDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //shows you all of the orders recorded in the database
        private void showAll(){ 
            try {
                ArrayList<Order> orders = db.fetchOrders();
                System.out.println("TABLE of Orders: ");
                orders.stream().forEach((order) -> {
                    System.out.printf("%-10s %-100s %-10s %-52s \n", order.getORDERID(), order.getPRODUCTNAME(), order.getPRODUCT_ID(),  order.getPRICE());
                });
            } catch (SQLException ex) {
                Logger.getLogger(TestOrderDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    
