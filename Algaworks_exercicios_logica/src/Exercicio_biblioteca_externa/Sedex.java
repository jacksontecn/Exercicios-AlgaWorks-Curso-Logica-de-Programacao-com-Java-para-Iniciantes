package Exercicio_biblioteca_externa;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import java.util.Scanner;

public class Sedex {
     private static void enviar(String para, String assunto, String msg, String username, String password) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.mail.yahoo.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator(username, password));
        email.setSSLOnConnect(true);
        email.setFrom(username);
        email.setSubject(assunto);
        email.setMsg(msg);
        email.addTo(para);
        email.send();
    }

    static void escreverEEnviar(Scanner readScanner, String preparandoEmail) throws EmailException {

       System.out.print("Digite o assunto do email: ");
       String assunto = readScanner.nextLine();
       String msg = preparandoEmail;
       System.out.print("Digite o email do destinatario: ");
       String para = readScanner.nextLine();
       System.out.print("Digite seu email yahoo: ");
       String username = readScanner.nextLine();
       System.out.print("Digite sua senha: ");
       String password = readScanner.nextLine();
       System.out.println("Enviando e-mail...");
       System.out.println();
       System.out.println("Email enviado com sucesso!");

       enviar(para,assunto,msg,username,password);

    }


}
