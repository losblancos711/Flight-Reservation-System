package com.company;

public class Main {

    public static void main(String[] args) {

        //Ticket Details
        Ticket ticket1 = new RegularTicket(
                "Breakfast",
                "ABCD1234", "Mumbai",
                "Chennai",
                "5",
                "16",
                "12D",
                150.0f,
                false,
                "GOAIR1234",
                "GOAIR AIRLINES",
                140,
                100,
                "Street no.1",
                "Chennai",
                "Tamil Nadu",
                "Karthik",
                "7358200324",
                "rkartik67@gmail.com"
        );

        //Ticket Details
        Ticket ticket2 = new TouristTicket("ITC Chola",
                new String[]{
                        "Bangalore",
                        "Pune",
                        "Dehradun", null, null
                },
                "89567DDB",
                "Bangalore",
                "Chennai",
                "5",
                "12",
                "1D",
                200.0f,
                false,
                "ASDF0007",
                "INDIGO",
                100,
                95,
                "Street no.2",
                "Chennai",
                "Tamil Nadu",
                "Karan",
                "9876543210",
                "karan@icloud.com"
        );

        //Calling Function printTicketDetails
        printTicketDetails(ticket1);
        printTicketDetails(ticket2);
    }

    public static void printTicketDetails(Ticket ticket){
        ticket.printDetails(ticket);
    }
}