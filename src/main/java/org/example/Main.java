package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        contattiManagement cont = new contattiManagement();
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("che operazione vuoi fare?" + "\n" +
                    " 1 aggiungere nuovo contatto \n " +
                    "2 visualizzare contatto \n " +
                    "3 aggiornare contatto \n " +
                    "4 eliminare contatto \n " +
                    "5 ricerca per nome");
             ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("inserisci id");
                    int id = sc.nextInt();
                    System.out.println("inserisci nome");
                    String nome = sc.next();
                    System.out.println("inserisci cognome");
                    String cognome = sc.next();
                    cont.addContact(id, nome, cognome);
                    break;
                case 2:
                    List<Contatto> contacts= cont.readContact();
                    for (Contatto contact:contacts) {
                        System.out.println(contact.getId() + " "+contact.getNome()+" " + contact.getCognome());
                    }
                break;
                case 3:
                    System.out.println("inserisci id da aggiornare");
                    int idUpDate = sc.nextInt();
                    System.out.println("inserisci nome");
                    String nomeUpDate = sc.next();
                    System.out.println("inserisci cognome");
                    String cognomeUpDate = sc.next();
                    cont.upDateContac(idUpDate, nomeUpDate, cognomeUpDate);
                    break;

                case 4:
                    System.out.println("inserisci id da cancellare");
                    int idDelete = sc.nextInt();
                    cont.deleteContac(idDelete);
                    break;
                case 5:
                    System.out.println("inserisci il nome da ricercare");
                    String name=sc.next();
                    List<Contatto> contactName= cont.readContactNome(name);
                    for (Contatto contact:contactName) {
                        System.out.println(contact.getId() + " "+contact.getNome()+" " + contact.getCognome());
                    }
                    break;
                default:
                    break;
            }
        }while(ch!=0);
    }
}
