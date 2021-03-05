package behavioral_patterns.iterator.iterator;

import behavioral_patterns.iterator.profile.Profile;

/**
 * 定义档案接口
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}