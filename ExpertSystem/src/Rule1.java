
public class Rule1 {
//wifi speed is affected

    Rule2 r2;
    String resultR1;
    Vendor contactVendor;

    String questionR1Q1(boolean valueQuestion) {
        if (valueQuestion == true) {
            resultR1 = "Is your device far from router? ";
        }
        return resultR1;
    }

    String questionR1Q2(boolean valueQuestion) {
        if (valueQuestion == true) {
            resultR1 = "Other device has bluetooth connection?   ";
        }
        return resultR1;
    }

    String result(boolean valueResult) {
        if (valueResult == true) {
            return r2;
        } else {
            return contactVendor.contactVendor();
        }
    }
}
