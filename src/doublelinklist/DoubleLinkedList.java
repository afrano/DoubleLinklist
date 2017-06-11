/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublelinklist;

/**
 *
 * @author NANO
 */
public class DoubleLinkedList {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        
      
        myList.addFirst(25);
        myList.addLast(45);
        myList.addLast(55);
        myList.addLast(65);
        myList.addLast(70);
        
        System.out.println("Menampilkan linkedList dari urutan awal ke akhir ");
        System.out.println(myList.toString());
        System.out.println();
        
        System.out.println("Menampilkan linkedList dari urutan terakhir ke awal");
        System.out.println(myList.Lawannya());
        System.out.println();
                
        System.out.println("LinkedList sebeluh dihapus : ");
        System.out.println(myList.toString());
        System.out.println();
        
        myList.removeFirst();
        System.out.println("Hapus Pertama");
        System.out.println(myList.toString());
        
        myList.removeLast();        
        System.out.println("Hapus Terakhir");
        System.out.println(myList.toString());        
    }
}
