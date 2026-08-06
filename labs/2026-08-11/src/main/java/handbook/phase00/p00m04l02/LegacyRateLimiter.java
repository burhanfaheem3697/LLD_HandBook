package handbook.phase00.p00m04l02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LegacyRateLimiter
 */
public class LegacyRateLimiter {

    private final int maxRequestsPerMinute;
    private final Map<String,List<Long>> requestLogs = new HashMap<>();

    public LegacyRateLimiter(){
        this(3);
    }

    public LegacyRateLimiter(int maxRequestsPerMinute){
        if(maxRequestsPerMinute <= 0){
            throw new IllegalArgumentException("Max requests must be positive");
        }
        this.maxRequestsPerMinute = maxRequestsPerMinute;
    }

    public boolean allowRequest(String clientId){
        if(clientId == null || clientId.trim().isEmpty()){
            throw new IllegalArgumentException("Client Id is required");
        }

        long now = System.currentTimeMillis();
        long windowStart = now - 60_000; // 1 minute window
        
        String key = clientId.trim().toLowerCase();
        requestLogs.putIfAbsent(key,new ArrayList<>());
        List<Long> timestamps = requestLogs.get(key);

        timestamps.removeIf(time -> time < windowStart);


        if(timestamps.size() < maxRequestsPerMinute){
            timestamps.add(now);
            return true;
        }

        return false;
    }

    public int getMaxRequestsPerMinute(){
        return maxRequestsPerMinute;
    }


}