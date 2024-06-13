import com.avmfs.Services.*;
import com.avmfs.Services.Map.*;
import com.avmfs.UserManagement.FleetManager;
import com.avmfs.Utility.UserRole;

public class AVMFSAPPLICATION {
    public static void main(String[] args) {
        PersonService personService = new PersonMapService();
        MaintenanceScheduleService maintenanceScheduleService = new MaintenanceMapService();
        ReservationService reservationService = new ReservationMapService();
        RouteService routeService = new RouteMapService();
        VehicleService vehicleService = new VehicleMapService();
        FleetManager fleetManager01 = new FleetManager(5L, "Kaveen", "Prabodhya", "example@domain.com", "Qwerty@123", UserRole.Manager, vehicleService, routeService, reservationService, maintenanceScheduleService, personService);
    }
}