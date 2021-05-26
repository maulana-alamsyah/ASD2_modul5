/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slinkedlist;

/**
 *
 * @author UserPCC
 */
public class SinglyLinkedListApp {

    public static void main(String[] args) {
        SinglyLinkedList asd = new SinglyLinkedList();
        asd.insertAwal(100);
        asd.display();
        asd.insertAkhir(200);
        asd.display();
        asd.insertAwal(50);
        asd.display();
        asd.insertAtPos(80, 2);
        asd.display();
        asd.deleteAtPos(1);
        asd.display();
        
        
        System.out.println();
        System.out.println("    Maulana Alamsyah");
        System.out.println("***** Terimakasih *****");
    }
}
