/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

/**
 *
 * @author Dell
 */
public class NewClass {
    
    public static void main(String[] args) {
        sendEmail("quanghh041087@gmail.com","to","asdfasdf");
    }
    
    public static int sendEmail(String to, String subject, String content){
        final String username = "quangtestlungtung@gmail.com";
        final String password = "quang1234";
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.trust", "*"); //SSL
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2"); //SSL

        Session sess = Session.getInstance(prop, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
            
        } );

        //Gui mail

        System.out.println(to + " " + subject+" "+content);
        try {
            Message mess = new MimeMessage(sess);
            mess.setFrom(new InternetAddress(username));
            mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            mess.setSubject(subject);
            mess.setText(content);

            Transport.send(mess);
            System.out.print("Done");
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        return 1;
    }
}
