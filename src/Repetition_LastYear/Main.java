package Repetition_LastYear;

public class Main
{
    public static void main(String[] args)
    {
        Plane p1 = new Plane(24,80, 73,391000,900, 910,"Lufthansa");
        //PassengerPlane pp1 = new PassengerPlane(25, 78, 76,397000, 1500, 850, "SwissAirlines" );
        Hangar h1 = new Hangar(1,"Grey","USA, Washington DC", "United States Airlines",120,100,50, true);

        h1.open();
        p1.changeAltitude(500);
    }
}
