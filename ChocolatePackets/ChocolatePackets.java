import java.util.*;
class ChocolatePackets {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,0,0,7,9,0,5,0,7,7,0};
        int count = 0; // Used to count No. of Zeros(Empty Packets) in the Conveyor Belt
        List<Integer> list = new ArrayList<>();//
        for(int i : arr){
            if(i == 0)//Counting No. of Zeros (Empty Packets)
                count++;
            if(i != 0 && !list.contains(i))//Adding to the list if it's not an Empty Packet(Zero)
                list.add(i);
        }
        Collections.sort(list,Collections.reverseOrder());//Reversing the List to Bring the Packet which contains More no. of Chocolates
        for(int i = 0;i < count; i++){
            list.add(0);//Adding the Empty Packets(Zeros) to the end of the List(Conveyor Belt)
        }
        System.out.println(list);//Final Conveyor Belt Arrangement
    }
}