class MeetingRoom {
    private String roomId;
    private int capacity;
    private int floor;
    private boolean hasZoomFacility;
    private String zoomDeviceId;
    private String zoomAccountId;

    public MeetingRoom(String roomId, int capacity, int floor, boolean hasZoomFacility) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
        this.hasZoomFacility = hasZoomFacility;
        this.zoomDeviceId = null;
        this.zoomAccountId = null;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean hasZoomFacility() {
        return hasZoomFacility;
    }

    public void setHasZoomFacility(boolean hasZoomFacility) {
        this.hasZoomFacility = hasZoomFacility;
    }

    public String getZoomDeviceId() {
        return zoomDeviceId;
    }

    public void setZoomDeviceId(String zoomDeviceId) {
        this.zoomDeviceId = zoomDeviceId;
    }

    public String getZoomAccountId() {
        return zoomAccountId;
    }

    public void setZoomAccountId(String zoomAccountId) {
        this.zoomAccountId = zoomAccountId;
    }
}

class             Booking {
    private String employeeId;
    private String meetingDate;
    private String meetingTime;
    private int duration;
    private MeetingRoom meetingRoom;

    public Booking(String employeeId, String meetingDate, String meetingTime, int duration, MeetingRoom meetingRoom) {
        this.employeeId = employeeId;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.duration = duration;
        this.meetingRoom = meetingRoom;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }
}

public class MeetingRoomApplication {
    public static void main(String[] args) {

        MeetingRoom room1 = new MeetingRoom("MR101", 10, 1, true);
        room1.setZoomDeviceId("65763");
        room1.setZoomAccountId("abcdef");

        Booking booking1 = new Booking("E1234", "2024-06-28", "10:00", 60, room1);

        System.out.println("Booking Details:");
        System.out.println("Employee ID: " + booking1.getEmployeeId());
        System.out.println("Meeting Date: " + booking1.getMeetingDate());
        System.out.println("Meeting Time: " + booking1.getMeetingTime());
        System.out.println("Duration: " + booking1.getDuration() + " minutes");
        System.out.println("Room ID: " + booking1.getMeetingRoom().getRoomId());
        System.out.println("Capacity: " + booking1.getMeetingRoom().getCapacity());
        System.out.println("Floor: " + booking1.getMeetingRoom().getFloor());
        if (booking1.getMeetingRoom().hasZoomFacility()) {
            System.out.println("Zoom Device ID: " + booking1.getMeetingRoom().getZoomDeviceId());
            System.out.println("Zoom Account ID: " + booking1.getMeetingRoom().getZoomAccountId());
        }
    }
}