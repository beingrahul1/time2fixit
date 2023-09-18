package com.stackroute.BookingService.model;

//import java.sql.Time;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "bookings")
public class BookingSlot {
    @Id
    private String bookingId;
    private String shopid;
    private String email;
    private String gadgetType;
    private String gadgetName;
    private String gadgetIMEI;
	private String issue;
    private Date date;
    private String time;
    
    
}
