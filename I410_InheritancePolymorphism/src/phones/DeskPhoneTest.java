package phones;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
* Tests the constructor and the public methods from
* the abstract class Phone.
*
* = = = This test class should not be modified. = = =
*/
class DeskPhoneTest {
private DeskPhone PushButtonPhone;
private DeskPhone RotaryPhone;
@BeforeEach
void setUp() throws Exception {
PushButtonPhone = new PushButtonPhone(
"JeKaVis J-P45", new Dimension(85, 85, 28), Voltage.DUAL);
RotaryPhone = new RotaryPhone(
"Pyle PRT45", new Dimension(205, 135, 92), Voltage.V110);
}
@Test
void deskPhone_initializeTheFields() {
DeskPhone p = new RotaryPhone(
"Model 500", new Dimension(143, 208, 119), Voltage.V110);
assertFalse(p.isConnected());
assertEquals("Model 500 (143.0 x 208.0 x 119.0) V110 not connected",
p.toString());
}
@Test
void plugIn_connectPhone() {
PushButtonPhone.PlugIn();
assertTrue(PushButtonPhone.isConnected());
RotaryPhone.PlugIn();
assertTrue(RotaryPhone.isConnected());
}
@Test
void unplug_disconnectPhone() {
PushButtonPhone.unPlug();
assertFalse(PushButtonPhone.isConnected());
RotaryPhone.unPlug();
assertFalse(RotaryPhone.isConnected());
}
@Test
void isConnected_pluggedIn_returnTrue() {
PushButtonPhone.PlugIn();
assertTrue(PushButtonPhone.isConnected());
}
@Test
void isConnected_unplugged_returnFalse() {
RotaryPhone.unPlug();
assertFalse(RotaryPhone.isConnected());
}
@Test
void toString_returnsModelDimensionVoltageAndConnectionInfo() {
assertEquals("JeKaVis J-P45 (85.0 x 85.0 x 28.0) DUAL not connected",
PushButtonPhone.toString());
RotaryPhone.PlugIn();
assertEquals("Pyle PRT45 (205.0 x 135.0 x 92.0) V110 connected",
RotaryPhone.toString());
}
}


