import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

import 'package:flutter_localizations/flutter_localizations.dart';

import 'package:im_flutter_sdk/im_flutter_sdk.dart';
import 'package:im_flutter_sdk_example/pages/chatgroup_list_page.dart';
import 'package:im_flutter_sdk_example/pages/chatroom_list_page.dart';
import 'package:im_flutter_sdk_example/pages/public_group_list_page.dart';
import 'package:im_flutter_sdk_example/pages/call_page.dart';

import 'utils/localizations.dart';
import 'pages/home_page.dart';
import 'package:im_flutter_sdk_example/pages/login_page.dart';
import 'package:im_flutter_sdk_example/pages/register_page.dart';
import 'package:im_flutter_sdk_example/pages/contacts_list_page.dart';
import 'package:im_flutter_sdk_example/pages/items/contact_add.dart';
import 'package:im_flutter_sdk_example/pages/chat_page.dart';
import 'utils/style.dart';
import 'common/common.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> implements EMConnectionListener {
  @override
  bool isLogin = false;

  void initState() {
    super.initState();
    initEaseMobSDK();
  }

  void initEaseMobSDK() async {
    EMOptions options = EMOptions(appKey: 'easemob-demo#chatdemoui');
    EMPushConfig config = EMPushConfig();
    // 判断是否为debug模式
    if (!kReleaseMode) {
      config
        ..enableAPNs("chatdemoui_dev")
        ..enableOppPush('oppoAppKey', 'oppoAppSecret')
        ..enableHWPush()
        ..enableFCM('fcmId')
        ..enableMeiZuPush('mzAppId', 'mzAppKey')
        ..enableMiPush('miAppId', 'miAppKey');
    } else {
      config
        ..enableAPNs('chatdemoui')
        ..enableOppPush('oppoAppKey', 'oppoAppSecret')
        ..enableHWPush()
        ..enableFCM('fcmId')
        ..enableMeiZuPush('mzAppId', 'mzAppKey')
        ..enableMiPush('miAppId', 'miAppKey');
    }

    options.debugModel = true;
    options.pushConfig = config;

    await EMClient.getInstance.init(options);
    EMClient.getInstance.addConnectionListener(this);

//    EMClient.getInstance.callManager.registerCallSharedManager();
//    EMClient.getInstance.conferenceManager.registerConferenceSharedManager();
    setState(() {
      isLogin = EMClient.getInstance.isLoginBefore;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      /// 配置跳转路由
      routes: <String, WidgetBuilder>{
        Constant.toRegisterPage: (BuildContext context) => new RegisterPage(),
        Constant.toLoginPage: (BuildContext context) => new LoginPage(),
        Constant.toHomePage: (BuildContext context) => new HomePage(),
        Constant.toChatRoomListPage: (BuildContext context) =>
            new EMChatRoomListPage(),
        Constant.toChatPage: (BuildContext context) => new ChatPage(),
        Constant.toAddContact: (BuildContext context) => new EMContactAddPage(),
        Constant.toContactList: (BuildContext context) =>
            new EMContactsListPage(),
        Constant.toChatGroupListPage: (BuildContext context) =>
            new EMChatGroupListPage(),
        Constant.toPublicGroupListPage: (BuildContext context) =>
            new PublicGroupListPage(),
        Constant.toCallPage: (BuildContext context) => new CallPage(),
      },

      /// 配置国际化语言
      localizationsDelegates: [
        GlobalMaterialLocalizations.delegate,
        GlobalWidgetsLocalizations.delegate,
        DemoLocalizationsDelegate.delegate,
      ],
      supportedLocales: [
        const Locale('en', 'US'), // 美国英语
        const Locale('zh', 'CH'), // 中文简体
        // ... other locales the app supports
      ],

      title: '环信即时通讯云',

      ///浅色模式，设置的颜色可能影响其他组件，可以通过判断ThemeUtils.isDark去设置对应颜色
      theme: new ThemeData(
        brightness: Brightness.light,
        accentColor: EMColor.buttonDisabled,
        backgroundColor: EMColor.bgColor,
        bottomAppBarColor: EMColor.appMain,
        buttonColor: EMColor.buttonDisabled,
        dialogBackgroundColor: EMColor.appMain,
        hintColor: EMColor.textGray,
        errorColor: EMColor.red,
        primaryColor: EMColor.buttonDisabled,
        scaffoldBackgroundColor: EMColor.bgColor,
      ),

      ///深色模式
      darkTheme: ThemeData(
        brightness: Brightness.dark,
        accentColor: EMColor.darkButtonDisabled,
        backgroundColor: EMColor.darkBgColor,
        bottomAppBarColor: EMColor.darkAppMain,
        buttonColor: EMColor.darkButtonDisabled,
        dialogBackgroundColor: EMColor.darkAppMain,
        hintColor: EMColor.darkTextGray,
        errorColor: EMColor.darkRed,
        primaryColor: EMColor.darkAppMain,
        scaffoldBackgroundColor: EMColor.darkBgColor,
      ),
      home: isLogin ? HomePage() : LoginPage(),
    );
  }

  /// EMConnectionListener
  @override
  void onConnected() {}

  @override
  void onDisconnected(int errorCode) {}
}
