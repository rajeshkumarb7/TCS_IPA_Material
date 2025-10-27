import java.util.Scanner;
public class ipa_5_raj {
    public static void main(String[] args){
        /*HotelId - int
        HotelName - String
        dateOfBooking – String (in the format dd-mon-yyyy)
        noOfRoomsBooked – int
        cabFacility – String
        totalBill- double*/
        int id,noofrooms;
        String name,date,cab;
        Double bill;
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        Hotel[] hotel=new Hotel[4];
        for(int i=0;i<4;i++){
            id=sc.nextInt();sc.nextLine();
            name=sc.nextLine();
            date=sc.nextLine();
            noofrooms=sc.nextInt();
            sc.nextLine();
            cab=sc.nextLine();
            bill=sc.nextDouble();sc.nextLine();
            hotel[i]=new Hotel(id,name,bill,date,noofrooms,cab);
        }
        String fici=sc.nextLine();

        int ans=totalNoOfRoomsBooked(hotel,fici);
        if(ans==0){
            System.out.println("No such rooms booked");
        }
        else{
            System.out.println(ans);
        }
    }
    public  static int totalNoOfRoomsBooked(Hotel[] hotel,String cab){
        int tot=0;
        for(int i=0;i<hotel.length;i++){
            if(hotel[i].getCabFacility().equalsIgnoreCase(cab)&&hotel[i].noOfRoomBooked()>5){
                tot+=hotel[i].noOfRoomBooked();
            }
        }
        return tot;
    }
}

class Hotel{
    private int HotelId,noOfRoomBooked;
    private double totalBill;
    private String cabFacility,hotelName,dateOfBooking;
    public Hotel(int id,String name,double bill,String date,int noroom,String cab){
        this.HotelId=id;
        this.noOfRoomBooked=noroom;
        this.cabFacility=cab;
        this.totalBill=bill;
        this.hotelName=name;
        this.dateOfBooking=date;
    }
    public String getCabFacility() {
        return cabFacility;
    }
    public int noOfRoomBooked(){
        return noOfRoomBooked;
    }


}
