package mage.players.net;

import java.io.Serializable;

/**
 * User data that is passed during connection to the server.
 *
 * @author ayrat
 */
public class UserData implements Serializable {

    protected int groupId;
    protected int avatarId;
    protected boolean showAbilityPickerForced;
    protected String privateKey;

    public UserData(UserGroup userGroup, int avatarId, boolean showAbilityPickerForced) {
        this.groupId = userGroup.getGroupId();
        this.avatarId = avatarId;
        this.showAbilityPickerForced = showAbilityPickerForced;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }

    public boolean isShowAbilityPickerForced() {
        return showAbilityPickerForced;
    }

    public void setShowAbilityPickerForced(boolean showAbilityPickerForced) {
        this.showAbilityPickerForced = showAbilityPickerForced;
    }
    
}
