import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehicleTypeTest {

	@Test
	void test_canBeRentedForMinimumDays1() {
		VehicleType vehicleType = new VehicleType(4);
		FechaHora dateTime = new FechaHora();
		String type = "car";
		assertEquals(2, vehicleType.canBeRentedForMinimumDays(dateTime, type));
	}

}
