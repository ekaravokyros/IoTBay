/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nixon
 */
@WebServlet(name = "PaymentDeleteServlet", urlPatterns = {"/PaymentDeleteServlet"})
public class PaymentDeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the selected payment ID from the request
        String selectedPaymentId = request.getParameter("payment_records");

        // Get the list of payment records from a suitable source (e.g., database)
        List<String> paymentRecords = getPaymentRecords();

        // Remove the option with the matching payment ID from the list
        paymentRecords.remove(selectedPaymentId);

        // Store the updated list of payment records in the request scope
        request.setAttribute("paymentRecords", paymentRecords);

        // Redirect back to the JSP page
        response.sendRedirect("payment_delete.jsp");
    }

    private List<String> getPaymentRecords() {
        // This is just a dummy implementation.
        // Replace it with your actual logic to retrieve payment records.
        List<String> paymentRecords = new ArrayList<>();
        paymentRecords.add("PaymentID1");
        paymentRecords.add("PaymentID2");
        paymentRecords.add("PaymentID3");
        return paymentRecords;
    }
}
