package com.location.tracker.service;

import java.util.List;
import com.location.tracker.data.LocationTrace;
import com.location.tracker.repository.DriverInformation;
import com.location.tracker.repository.VehicleInformation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/location/tracker")
public interface LocationTrackerService {

    @RequestMapping(path="/addVehicle" ,method = RequestMethod.PUT )
    public void addVehicle(@RequestBody VehicleInformation vehicleInformation);

    @RequestMapping(path="/addDriver" ,method = RequestMethod.PUT )
    public void addDriver(@RequestBody DriverInformation driverInformation);

    @RequestMapping(path="/updateVehicleDevice" ,method = RequestMethod.PUT )
    public void updateDeviceForVehicle(@RequestParam("regNumber") String regNumber, @RequestParam("deviceId") Long deviceId);

    @RequestMapping(path="/insertTracePoint" ,method = RequestMethod.PUT )
    public void updateDevicelocation(@RequestBody LocationTrace locTrace);

    @RequestMapping(path="/getDeviceLocation" ,method = RequestMethod.GET )
    public List<LocationTrace> getLocationLogForDevice(@RequestParam("deviceId") Long deviceId, @RequestParam("fromTime") String fromTime, @RequestParam("toTime") String toTime);

    @RequestMapping(path="/getMobileLocation" ,method = RequestMethod.GET )
    public  List<LocationTrace> getLocationLogForMobile(@RequestParam("mobileNumber") String mobileNumber, @RequestParam("fromTime") String fromTime, @RequestParam("toTime") String toTime);


}
