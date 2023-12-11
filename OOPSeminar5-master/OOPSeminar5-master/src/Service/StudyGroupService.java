package Service;

import java.util.ArrayList;
import java.util.List;
import Data.StudyGroup;

public class StudyGroupService {

    static List<StudyGroup> groupList = new ArrayList<>();

    public void createGroup(int teacherId, List<Integer> studentIds) {
        int id = getMaxIdGroup();
        groupList.add(new StudyGroup(id, teacherId, studentIds));

    }

    private int getMaxIdGroup() {
        int maxId = 1;
        for (StudyGroup studyGroup : groupList) {
            if (studyGroup.getGroupId() >= maxId) {
                maxId = studyGroup.getGroupId() + 1;
            }
        }
        return maxId;
    }

    public List<StudyGroup> getConcGroup() {
        List<StudyGroup> resultList = groupList;
        return resultList;
    }

    public List<StudyGroup> getGroupList() {
        return groupList;
    }

    
}
