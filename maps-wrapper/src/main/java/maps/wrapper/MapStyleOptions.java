package maps.wrapper;

import android.content.Context;
import android.content.res.Resources.NotFoundException;

public class MapStyleOptions {

    com.google.android.gms.maps.model.MapStyleOptions google;
    com.huawei.hms.maps.model.MapStyleOptions huawei;

    public static MapStyleOptions loadRawResourceStyle(
        Context clientContext,
        int googleResourceId,
        int huaweiResourceId) throws NotFoundException {
        MapStyleOptions options = new MapStyleOptions();
        options.huawei = com.huawei.hms.maps.model.MapStyleOptions.loadRawResourceStyle(clientContext, huaweiResourceId);
        options.google = com.google.android.gms.maps.model.MapStyleOptions.loadRawResourceStyle(clientContext, googleResourceId);

        return options;
    }

    private MapStyleOptions() {
    }

    public MapStyleOptions(
        String googleJson,
        String huaweiJson
    ) {
        this.google = new com.google.android.gms.maps.model.MapStyleOptions(googleJson);
        this.huawei = new com.huawei.hms.maps.model.MapStyleOptions(huaweiJson);
    }
}
