package structural_patterns.proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * 远程服务接口
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}