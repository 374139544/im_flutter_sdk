package com.easemob.im_flutter_sdk;

public class EMSDKMethod {
    /// EMClient methods
    static final String init = "init";
    static final String createAccount = "createAccount";
    static final String login = "login";
    static final String logout = "logout";
    static final String changeAppKey = "changeAppKey";
    static final String isLoggedInBefore = "isLoggedInBefore";
    static final String updateCurrentUserNick = "updateCurrentUserNick";
    static final String uploadLog = "uploadLog";
    static final String compressLogs = "compressLogs";
    static final String kickDevice = "kickDevice";
    static final String kickAllDevices = "kickAllDevices";
    static final String getLoggedInDevicesFromServer = "getLoggedInDevicesFromServer";
    static final String getCurrentUser = "getCurrentUser";

    static final String onConnected = "onConnected";
    static final String onDisconnected = "onDisconnected";
    static final String onMultiDeviceEvent = "onMultiDeviceEvent";
    static final String onSendDataToFlutter = "onSendDataToFlutter";

    /// EMContactManager methods
    static final String addContact = "addContact";
    static final String deleteContact = "deleteContact";
    static final String getAllContactsFromServer = "getAllContactsFromServer";
    static final String getAllContactsFromDB = "getAllContactsFromDB";
    static final String addUserToBlockList = "addUserToBlockList";
    static final String removeUserFromBlockList = "removeUserFromBlockList";
    static final String getBlockListFromServer = "getBlockListFromServer";
    static final String getBlockListFromDB = "getBlockListFromDB";
    static final String acceptInvitation = "acceptInvitation";
    static final String declineInvitation = "declineInvitation";
    static final String getSelfIdsOnOtherPlatform = "getSelfIdsOnOtherPlatform";


    static final String onContactChanged = "onContactChanged";

    /// EMChatManager methods
    static final String sendMessage = "sendMessage";
    static final String resendMessage = "resendMessage";
    static final String ackMessageRead = "ackMessageRead";
    static final String ackGroupMessageRead = "ackGroupMessageRead";
    static final String ackConversationRead = "ackConversationRead";
    static final String recallMessage = "recallMessage";
    static final String getConversation = "getConversation";
    static final String markAllChatMsgAsRead = "markAllChatMsgAsRead";
    static final String getUnreadMessageCount = "getUnreadMessageCount";
    static final String updateChatMessage = "updateChatMessage";
    static final String downloadAttachment = "downloadAttachment";
    static final String downloadThumbnail = "downloadThumbnail";
    static final String importMessages = "importMessages";
    static final String loadAllConversations = "loadAllConversations";
    static final String getConversationsFromServer = "getConversationsFromServer";
    static final String deleteConversation = "deleteConversation";
    static final String fetchHistoryMessages = "fetchHistoryMessages";
    static final String searchChatMsgFromDB = "searchChatMsgFromDB";
    static final String getMessage = "getMessage";
    static final String asyncFetchGroupAcks = "asyncFetchGroupAcks";

    /// EMChatManager listener
    static final String onMessagesReceived = "onMessagesReceived";
    static final String onCmdMessagesReceived = "onCmdMessagesReceived";
    static final String onMessagesRead = "onMessagesRead";
    static final String onGroupMessageRead = "onGroupMessageRead";
    static final String onMessagesDelivered = "onMessagesDelivered";
    static final String onMessagesRecalled = "onMessagesRecalled";

    static final String onConversationUpdate = "onConversationUpdate";
    static final String onConversationHasRead = "onConversationHasRead";

    /// EMMessage listener
    static final String onMessageProgressUpdate = "onMessageProgressUpdate";
    static final String onMessageError = "onMessageError";
    static final String onMessageSuccess = "onMessageSuccess";
    static final String onMessageReadAck = "onMessageReadAck";
    static final String onMessageDeliveryAck = "onMessageDeliveryAck";
    static final String onMessageStatusChanged = "onMessageStatusChanged";

    /// EMConversation
    static final String getUnreadMsgCount = "getUnreadMsgCount";
    static final String markAllMessagesAsRead = "markAllMessagesAsRead";
    static final String markMessageAsRead = "markMessageAsRead";
    static final String syncConversationExt = "syncConversationExt";
    static final String syncConversationName = "syncConversationName";
    static final String removeMessage = "removeMessage";
    static final String getLatestMessage = "getLatestMessage";
    static final String getLatestMessageFromOthers = "getLatestMessageFromOthers";
    static final String clearAllMessages = "clearAllMessages";
    static final String insertMessage = "insertMessage";
    static final String appendMessage = "appendMessage";
    static final String updateConversationMessage = "updateConversationMessage";

    // 根据消息id获取消息
    static final String loadMsgWithId = "loadMsgWithId";
    // 根据起始消息id获取消息
    static final String loadMsgWithStartId = "loadMsgWithStartId";
    // 根据关键字获取消息
    static final String loadMsgWithKeywords = "loadMsgWithKeywords";
    // 根据消息类型获取消息
    static final String loadMsgWithMsgType = "loadMsgWithMsgType";
    // 通过时间获取消息
    static final String loadMsgWithTime = "loadMsgWithTime";

    // EMChatRoomManager
    static final String joinChatRoom = "joinChatRoom";
    static final String leaveChatRoom = "leaveChatRoom";
    static final String fetchPublicChatRoomsFromServer = "fetchPublicChatRoomsFromServer";
    static final String fetchChatRoomInfoFromServer = "fetchChatRoomInfoFromServer";
    static final String getChatRoom = "getChatRoom";
    static final String getAllChatRooms = "getAllChatRooms";
    static final String createChatRoom = "createChatRoom";
    static final String destroyChatRoom = "destroyChatRoom";
    static final String changeChatRoomSubject = "changeChatRoomSubject";
    static final String changeChatRoomDescription = "changeChatRoomDescription";
    static final String fetchChatRoomMembers = "fetchChatRoomMembers";
    static final String muteChatRoomMembers = "muteChatRoomMembers";
    static final String unMuteChatRoomMembers = "unMuteChatRoomMembers";
    static final String changeChatRoomOwner = "changeChatRoomOwner";
    static final String addChatRoomAdmin = "addChatRoomAdmin";
    static final String removeChatRoomAdmin = "removeChatRoomAdmin";
    static final String fetchChatRoomMuteList = "fetchChatRoomMuteList";
    static final String removeChatRoomMembers = "removeChatRoomMembers";
    static final String blockChatRoomMembers = "blockChatRoomMembers";
    static final String unBlockChatRoomMembers = "unBlockChatRoomMembers";
    static final String fetchChatRoomBlockList = "fetchChatRoomBlockList";
    static final String updateChatRoomAnnouncement = "updateChatRoomAnnouncement";
    static final String fetchChatRoomAnnouncement = "fetchChatRoomAnnouncement";

    static final String addMembersToChatRoomWhiteList = "addMembersToChatRoomWhiteList";
    static final String removeMembersFromChatRoomWhiteList = "removeMembersFromChatRoomWhiteList";
    static final String fetchChatRoomWhiteListFromServer = "fetchChatRoomWhiteListFromServer";
    static final String isMemberInChatRoomWhiteListFromServer = "isMemberInChatRoomWhiteListFromServer";

    static final String muteAllChatRoomMembers = "muteAllChatRoomMembers";
    static final String unMuteAllChatRoomMembers = "umMuteAllChatRoomMembers";


    // EMChatRoomManagerListener
    static final String chatRoomChange = "onChatRoomChanged";

    /// EMGroupManager
    static final String getGroupWithId = "getGroupWithId";
    static final String getJoinedGroups = "getJoinedGroups";
    static final String getGroupsWithoutPushNotification = "getGroupsWithoutPushNotification";
    static final String getJoinedGroupsFromServer = "getJoinedGroupsFromServer";
    static final String getPublicGroupsFromServer = "getPublicGroupsFromServer";
    static final String createGroup = "createGroup";
    static final String getGroupSpecificationFromServer = "getGroupSpecificationFromServer";
    static final String getGroupMemberListFromServer = "getGroupMemberListFromServer";
    static final String getGroupBlockListFromServer = "getGroupBlockListFromServer";
    static final String getGroupMuteListFromServer = "getGroupMuteListFromServer";
    static final String getGroupWhiteListFromServer = "getGroupWhiteListFromServer";
    static final String isMemberInWhiteListFromServer = "isMemberInWhiteListFromServer";
    static final String getGroupFileListFromServer = "getGroupFileList";
    static final String getGroupAnnouncementFromServer = "getGroupAnnouncementFromServer";
    static final String addMembers = "addMembers";
    static final String inviterUser = "inviterUser";
    static final String removeMembers = "removeMembers";
    static final String blockMembers = "blockMembers";
    static final String unblockMembers = "unblockMembers";
    static final String updateGroupSubject = "updateGroupSubject";
    static final String updateDescription = "updateDescription";
    static final String leaveGroup = "leaveGroup";
    static final String destroyGroup = "destroyGroup";
    static final String blockGroup = "blockGroup";
    static final String unblockGroup = "unblockGroup";
    static final String updateGroupOwner = "updateGroupOwner";
    static final String addAdmin = "addAdmin";
    static final String removeAdmin = "removeAdmin";
    static final String muteMembers = "muteMembers";
    static final String unMuteMembers = "unMuteMembers";
    static final String muteAllMembers = "muteAllMembers";
    static final String unMuteAllMembers = "unMuteAllMembers";
    static final String addWhiteList = "addWhiteList";
    static final String removeWhiteList = "removeWhiteList";
    static final String uploadGroupSharedFile = "uploadGroupSharedFile";
    static final String downloadGroupSharedFile = "downloadGroupSharedFile";
    static final String removeGroupSharedFile = "removeGroupSharedFile";
    static final String updateGroupAnnouncement = "updateGroupAnnouncement";
    static final String updateGroupExt = "updateGroupExt";
    static final String joinPublicGroup = "joinPublicGroup";
    static final String requestToJoinPublicGroup = "requestToJoinPublicGroup";
    static final String acceptJoinApplication = "acceptJoinApplication";
    static final String declineJoinApplication = "declineJoinApplication";
    static final String acceptInvitationFromGroup = "acceptInvitationFromGroup";
    static final String declineInvitationFromGroup = "declineInvitationFromGroup";
    static final String ignoreGroupPush = "ignoreGroupPush";

    /// EMGroupManagerListener
    static final String onGroupChanged = "onGroupChanged";

    /// EMPushManager
    static final String getImPushConfig = "getImPushConfig";
    static final String getImPushConfigFromServer = "getImPushConfigFromServer";
    static final String updatePushNickname = "updatePushNickname";
    static final String updateHMSPushToken = "updateHMSPushToken";
    static final String updateFCMPushToken = "updateFCMPushToken";

    /// ImPushConfig
    static final String imPushNoDisturb = "imPushNoDisturb";
    static final String updateImPushStyle = "updateImPushStyle";
    static final String updateGroupPushService = "updateGroupPushService";
    static final String getNoDisturbGroups = "getNoDisturbGroups";


    /// EMUserInfoManager 
    static final String updateOwnUserInfo = "updateOwnUserInfo";
    static final String updateOwnUserInfoWithType = "updateOwnUserInfoWithType";
    static final String fetchUserInfoById = "fetchUserInfoById";
    static final String fetchUserInfoByIdWithType = "fetchUserInfoByIdWithType";
}
