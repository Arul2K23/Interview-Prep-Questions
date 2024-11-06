class EmptySeater {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String s = "";//Used to Make Seating Arrangements
        for(int i : arr){
            if(i % 2 ==0 ){//Adds two Empty Seats near the Person with Even Reg No
                s += String.valueOf(i)+"00";
            }
            else{//Adds One Empty Seat near the Person with Odd Reg No
                s += String.valueOf(i)+"0";
            }
        }
        long temp = Long.valueOf(s);//Incase of returning a Numerical(Long) Value
        System.out.println(temp);
    }
}