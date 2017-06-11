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
public class LinkedList {
    //mendeklarasikan 2 atributnya
    private ListNode head;
    private int size;
    
    //membuat constructornya

    public LinkedList() {//untuk inisialisasi
        head = new ListNode();
        head.setNext(head);//dia menunjuk dirinya sendiri
        head.setPrev(head);//dia menunjuk dirinya sendiri juga
        size=0;//walaupun didalam linkedList udah ada 1 elemen tpi ttap ngak diisi data hanya sebagai kepala
        //dia akan bertambah jika kita menambahkan data di linkedList
    }
    
    //membuat method-methodnya
    //yang digunakan untuk menaruh/menambahkan node di depan atau di belakang
    public void addFirst (int elemen){//di awal
        addBefore(elemen, head.getNext());//menambahkan simpul baru sebelum head dan sesudah pertama
    }
    
    public void addLast (int elemen){
        addBefore(elemen, head);//untuk meletakkan elemen di akhir, yakni sebelum head
    }
    
    //method* yang digunakan untuk menghaps nodepaling depan /belakang
    public int removeFirst(){
        return remove(head.getNext());
    }
    
    public int removeLast(){
        return remove(head.getPrev());
    }
    
    //untuk meletakkan elemen tidak harus didepan atau belakang
    //yakni untuk memasukkan elemen sebelum titik tertentu
    public ListNode addBefore(int elemen, ListNode node){
        ListNode baru = new ListNode (elemen);
        node.getPrev().setNext(baru);//ini akan mengubah link dari next head ke baru bukan ke node
        baru.setPrev(node.getPrev());//mengarahkan prev baru mengarah ke simpul node yang dituju prev
        baru.setNext(node);//next dari baru diarahkan ke node.
        node.setPrev(baru);//mengarahkan prev node ke baru
        return baru;//sebagai optional jika tidak mau menggunakan return tipe method void
    }
        
    public int remove(ListNode node){//untuk meremove sebuah simpul
        ListNode kiri = node.getPrev();
        ListNode kanan = node.getNext();
        kiri.setNext(kanan);
        kanan.setPrev(kiri);
        return node.getElemen();
    }
    //membuat getset nya

    public ListNode getHead() {
        return head;
    }
    
    public int getSize() {
        return size;
    }
    
    //method yang digunakan untuk mendeteksi isEmpty atau tidak
    public boolean isEmpty(){
        return false;
    }
    
    //method untuk menampilkannya di layar
    public String toString(){
        String result = " ";
        ListNode node = head.getNext();
        while(node!=head){//looping selama node tidak samadengan head
            //dalam perloopingan yang ditampilkan pertama adalah elemen pertama dan seterusnya sampai terakhir
            result = result+node.getElemen()+" ";
            node=node.getNext();
        }
        return result;
    }
    
    public String Lawannya(){
        String result = " ";
        ListNode node = head.getPrev();
        while(node!=head){
            result=result+node.getElemen()+" ";
            node=node.getPrev();
        }
        return result;
    }
    
}

/*
inisialisasi double linked
dilakukan pada constructornya
di head data tidak bisa dtambahkan.
laporan:
proses inisialisasi
proses menambhakan simpul di awal dan akhir
menghapus di awal dan akhir bagaimana
menampilkan urutan pertama-terakhir
dan dari terakhir-awal
*/