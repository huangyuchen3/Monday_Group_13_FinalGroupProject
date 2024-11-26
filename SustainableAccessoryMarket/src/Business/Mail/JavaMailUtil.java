/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package Business.Mail;

/**
 *
 *@author ankitapatil
 */
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
/*
import com.db4o.cs.internal.messages.Message;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import jdk.internal.net.http.websocket.Transport;

public class JavaMailUtil {
    public static void sendMail(String recepientMail, String recepientName , String verificationCode) throws Exception {
        System.out.println("Preparing to send an email");
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "nourishbridge@gmail.com";
        String password = "tbcmaaezpophygzw";
        
        

        Session session = Session.getInstance(properties, new Authenticator() {
            

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("nourishbridge@gmail.com", "tbcmaaezpophygzw");
            }
        });
        Message message = prepareMessage(session, "nourishbridge@gmail.com", recepientMail, recepientName,verificationCode);

        Transport.send(message);
        System.out.println("Mail sent successfully");
        System.out.println("thisis mty "
                + "mail");
    }

    public static Message prepareMessage(javax.mail.Session session, String myAccountEmail, String recepientMail, String recepientName,String verificationCode) {
        try {
            javax.mail.Message message = new javax.mail.internet.MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepientMail));
            message.setSubject("Account activation mail from Food Donation");
            message.setText("Hi " + recepientName + ". Welcome to the Nourish.Bridge.\n Please verify your account with this code:"+verificationCode);
            return message;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    
public static String getRandomCode(){
    Random rnd = new Random();
    int num = rnd.nextInt(999999);
    return String.format("%06d",num);
}
    
}
*/
