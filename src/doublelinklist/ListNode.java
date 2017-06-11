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
public class ListNode {
    private int elemen;
    private ListNode next;//menunjuk ke selanjutnya
    private ListNode prev;//menunjuk ke sebelumnya
    //membuat constructor yang kosong dan yang ada elemennya
    public ListNode() {
    }
    public ListNode(int elemen) {
        this.elemen = elemen;
    }
    //membuat enskapsulasi terhadap setiap atributya, yakni getset
    public int getElemen() {
        return elemen;
    }
    public void setElemen(int elemen) {
        this.elemen = elemen;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    public ListNode getPrev() {
        return prev;
    }
    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
//catatan : class ListNode ini membuatsimpul menjadi 3 bagian yakni prev, eleme, dan next    
}