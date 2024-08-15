## Requirements:

1.The rental System should allow customer to browse or reserve available car for a specific date.

2.Each car should have details such as model, year, license plate, seating capacity, rental price per day.

3.The system should handle reservation including creating, modifying, cancellation.

4.The system should keep track of the availability of cars and update the status accordingly.

5.The system should handle customer information , including name, contact info, driving license detail.

6.The system should handle payment processing for reservation.

7.(Optional) The system should be able to handle concurrent reservation and ensure data consisting.

## Classes:
1.Car

2.Customer

3.Reservation

4.Rental System

5.Payment

## Car Class:
1.Model

2.Year

3.licensePlate

4.RentalPricePerDay

5.Available

## Customer Class
1.Name

2.Contact Number

3.Driving License Number

## Reservation Class
1.Reservation id

2.Car

3.Customer

4.Start Date

5.End Date

6.Total price

## Payment -> folder -> model

      payment processor(interface) ->
      
          -> CreditCard
          -> PayPal
