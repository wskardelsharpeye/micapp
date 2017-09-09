package com.mic.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "order")
public @Data class Order {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "customized_requirement")
    private String customizedRequirement;

    @Column(name = "interview_id")
    private int interviewId;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name ="arrive_date")
    private Date arriveDate;

    @Column(name = "departure_from")
    private String departureFrom;

    @Column(name = "arrive_at")
    private String arriveAt;

    @Column(name = "flight_no")
    private String flightNo;

    @Column(name = "payment_id")
    private int paymentId;
}
