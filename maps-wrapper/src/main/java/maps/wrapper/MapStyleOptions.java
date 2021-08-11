package maps.wrapper;

import android.content.Context;
import android.content.res.Resources.NotFoundException;

public class MapStyleOptions {

    com.huawei.hms.maps.model.MapStyleOptions huawei;
    com.google.android.gms.maps.model.MapStyleOptions google;

    public static MapStyleOptions loadRawResourceStyle(
        Context clientContext,
        int googleResourceId,
        int huaweiResourceId) throws NotFoundException {
        return new MapStyleOptions(
            com.huawei.hms.maps.model.MapStyleOptions.loadRawResourceStyle(clientContext, huaweiResourceId),
            com.google.android.gms.maps.model.MapStyleOptions.loadRawResourceStyle(clientContext, googleResourceId)
        );
    }

    MapStyleOptions(
        com.huawei.hms.maps.model.MapStyleOptions huawei,
        com.google.android.gms.maps.model.MapStyleOptions google) {

        this.huawei = huawei;
        this.google = google;
    }
}
