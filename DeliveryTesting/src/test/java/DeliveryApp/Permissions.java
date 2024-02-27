package DeliveryApp;
import control.Button;
import org.openqa.selenium.By;

public class Permissions {
    public Button AproxLocation =new Button(By.id("com.android.permissioncontroller:id/permission_location_accuracy_radio_coarse"));
    public Button AppInUse=new Button(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
    public Button AllowMultimedia=new Button(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    public Button ContinueAproxLocation=new Button(By.id("com.android.permission-controller:id/permission_deny_button"));
    public Button DenyPermission=new Button(By.id("com.android.permissioncontroller:id/permission_deny_button"));
    public Button DenyPermissionAgain=new Button(By.id("com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button"));


}