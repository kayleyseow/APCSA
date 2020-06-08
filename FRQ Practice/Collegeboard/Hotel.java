//from 2005 APCS exam, Q1
/*
In this question, you will implement two methods for a class Hotel that is part of a hotel reservation system. The Hotel class uses the Reservation class shown below. A Reservation is for the person and room number specified when the Reservation is constructed.
a. 
Write the Hotel method requestRoom. Method requestRoom attempts to reserve a room in the hotel for a given guest. If there are any empty rooms in the hotel, one of them will be assigned to the named guest and the newly created reservation is returned. If there are no empty rooms, the guest is added to the end of the waiting list and null is returned.
b. 
Write the Hotel method cancelAndReassign. Method cancelAndReassign releases a previous reservation. If the waiting list for the hotel contains any names, the vacated room is reassigned to the first person at the beginning of the list. That person is then removed from the waiting list and the newly created reservation is returned. If no one is waiting, the room is marked as empty and null is returned.
In writing cancelAndReassign you may call any accessible methods in the Reservation and Hotel classes. Assume that these methods work as specified.
*/
public class Hotel{
	private Reservation[] rooms;
	private ArrayList waitList;
	public Reservation requestRoom (String guestName){
		for (int i=0;i<rooms.length;i++){
			if (rooms[i].getRoomNumber()!=i){
				Reservation temp = new Reservation(guestName,i);
				rooms[i] = temp;
				return temp;
			}
		}
		waitList.add(guestName);
		return null;
	}
	public Reservation cancelAndReassign(Reservation res){
		if (waitList.size()>0){
			rooms[res.getRoomNumber()] = new Reservation(waitList.get(0),res.getRoomNumber());
			waitList.remove(0);
			return rooms[res.getRoomNumber()];
		}
		else{
			rooms[res.getRoomNumber()] = null;
		}
	}
}
