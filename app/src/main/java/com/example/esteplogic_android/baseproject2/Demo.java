package com.example.esteplogic_android.baseproject2;

public class Demo
{
    /*

https://alison.com/topic/learn/34794/architecture-overview
AIE


Which method is called after an intent starts anretr Activity?

support for potrait and landscape
android:screenOrientation="sensor"



tablet
android tablet support

types of services in android


benefits of using fragments in android

The main reason to use Fragments are for the backstack and lifecycle features. Otherwise, custom views are more light weight and simpler to implement.

At first, I actually tried to build a phone/tablet app using custom views. Everything appeared to work across phones AND tablets, even switching from single panel to split panel. Where I ran into trouble was with the back button and life cycle. Since I was simply updating views manually...there was nothing keeping track of the history of views and their states. Therefore, the back button did not work as expected and it was difficult to recreate even the latest state during life cycle events, such as when rotating the app. To fix that, I had to wrap my custom views in fragments and use the FragmentManager so that the previous states would be saved and recreated.

Fragments are the reusable 


types of services in android

first method call when activity launched

difference between service and broadcast

java favourites

android favourites

how u call webservices

good in java or in android?

how u call web service

in retrofit where get response code

methods to handle error or success response in retrofit

activity lifecycle method

first method  call in launching activty lifecycle

diff b/w onstart and onresume methods of activity

method to call when activty  re-launches

android pass data between activities

services vs receiver

what are services

service runs on which thread

activty runs on which thread

advantages of using fragments






Limit of strings:
1GB Strings in Java9. Java8 on the other hand can have 2GB Strings.

You should be able to get a String of length Integer.MAX_VALUE (always2147483647 (231 - 1) by the Java specification, the maximum size of an array, which the String class uses for internal storage) or half your maximum heap size (since each character is two bytes), whichever is smaller.

Material Design :-
A material design app theme to style all your UI widgets
Widgets for complex views such as lists and cards
New APIs for custom shadows and animations
Promote your UI's main action with a Floating Action Button (FAB).
Show your brand, navigation, search, and other actions with the App Bar.












TIPS

Status bar:-


Android Notificaton bar:-



android notification panel:-






Honeycomb was the first version of Android with official support for tablets.
API Level: 11. For developers, the Android 3.0 platform ( HONEYCOMB )
Fragments were also introduced in that versions.


Getting error “The package appears to be corrupt” while installing apk file

Go to Build-> Build Apk(s).
After creating apk you will see a dialog as below.

Click on locate and install it in your phone




In this tutorial, we are going to learn how to parse Json object in android application using Gson. The resulting parsed object will be used to populate a RecyclerView.
json parsing


VOLLEY ANDROID
https://www.simplifiedcoding.net/android-volley-tutorial-fetch-json/
Android volley is a networking library was introduced to make networking calls much easier, faster without writing tons of code. By default all the volley network calls works asynchronously, so we don’t have to worry about using asynctask anymore.
Volley comes with lot of features. Some of them are
1. Request queuing and prioritization
2. Effective request cache and memory management
3. Extensibility and customization of the library to our needs
4. Cancelling the requests

FAST
LESS CODE
WORKS ASYNC
QUEUE AND PRIORITIZE
CUSTOM TO NEEDS
CANCEL REQUEST
etc

Steps :-

Add volley in dependency
Make request (call webservice url)

http://www.technotalkative.com/android-send-object-from-one-activity-to-another-activity/

/*
Send object from one activity to another through intent
 */
    Make class serialized whose object you want to transfer through intent
        NotificationManager notif=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
    Notification notify=new Notification.Builder(getApplicationContext()).
            setContentTitle(tittle).setContentText(body).setContentTitle(subject).
            setSmallIcon(R.drawable.ic_drawer).build();
    notify.flags |= Notification.FLAG_AUTO_CANCEL;
                         notif.notify(0, notify);



/*
Push  notification with images,
GCM
 */

    StringRequest stringRequest = new StringRequest(Request.Method.GET, JSON_URL, new Response.Listener<String>()
            – RequestQueue: A Queue containing the Network/HTTP Requests that needs to be made.
– Request: A Base Class which contains Network related information like HTTP Methods.
– StringRequest: HTTP Request where the response is parsed a String. View Source
– JsonObjectRequest: HTTP Request where the response is JSONObject. View Source





//gson
    https://inducesmile.com/android/android-json-parsing-using-gson-and-recyclerview/

    serialization and deserialzation
    convert json to java objs and vice versa.
    GSON used to parsed the data




    Retrofit
    Uses rest api ,
    Used for relatively easy to retrieve and upload JSON (or other structured data) via a REST based webservice

. Typically for JSON you use GSon, but you can add custom converters to process XML or other protocols. Retrofit uses the OkHttp library for HTTP requests.



    social media integrate
    gmail:-
    create android studio project
    in dos navigate to jdk folder
    get sha1 key
    open dev.console
    get config file by providing project name
    prepare java file and xml layout

    https://www.simplifiedcoding.net/google-login-android-tutorial-integrate-gplus-login/


    payment integrate
    //google map
    android calling
    android sms








    FOR Android MONITOR PRINT ON LOGCAT type logd and press tab button on keyboard

        (type three hyphens and press enter to get line in Ms-word)


    What is a “bundle” in an Android application

    Bundles are generally used for passing data between various Android activities. It depends on you what type of values you want to pass, but bundles can hold all types of values and pass them to the new activity.

    You can use it like this:

    Intent intent = new...
    Intent(getApplicationContext(), SecondActivity.class);
intent.putExtra("myKey", AnyValue);
    startActivity(intent);
    You can get the passed values by doing:

    Bundle extras = intent.getExtras();
    String tmp = extras.getString("myKey");

    Also Bundle as parameter of onCreate() Activity's life-cycle method can be used when you want to save data when device orientation is changed (in this case activity is destroyed and created again with non null parameter as Bundle).
    What is the savedInstanceState Bundle?
    The savedInstanceState is a reference to a Bundle object that is passed into the onCreate method of every Android Activity. Activities have the ability, under special circumstances, to restore themselves to a previous state using the data stored in this bundle. If there is no available instance data, the savedInstanceState -will be null. For example, the savedInstanceState will always be null the first time an Activity is started, but may be non-null if an Activity is destroyed during rotation.
    When do I save things to the Bundle?
    All activities have an onSaveInstanceState method that can be overridden. When this method is called, any state-related data should be placed into the outState Bundle. This method is called when an Activity is being backgrounded (either after onPause() or onStop(), depending on different factors).
    What should be saved?
    The savedInstanceState Bundle should only save information directly related to the current Activity state. Examples of this include:
        ●User selections – A user selects a tab. In onSaveInstanceState the tab selection gets added to the outState Bundle. During the next onCreate, the selected tab will be available within the Bundle, and the Activity should default to having that tab selected.
●Scroll view positions – A user scrolls half way through a ScrollView. The current position of the ScrollView should be saved in onSaveInstanceState then restored when the Activity is re-created.
●User-submitted data – If a user writes their username into a text box, they would expect the username to still be present when the Activity is resumed.
    What should not be saved?
    In general (with few exceptions), the following kinds of data should never be saved into the Bundle:
        ●Files
●Database data
●Images
●Videos
●Anything downloaded from the web (feed data)
●Models (the data kind, not the people kind)
    Rather than attempting to save and recover this information from the Bundle on rotation, the application should have caching and/or database systems set up that are built to deal specifically with these kinds of information.
    When is the savedInstanceState useful?
    There is one situation where using the savedInstanceState is almost mandatory: when the Activity gets destroyed during rotation. One way that Android handles rotation is to completely destroy and then re-create the current Activity. When the Activity is being destroyed, any state related information that is saved in onSaveInstanceState will be available when the Activity comes back online.
    Another situation is when your Activity gets backgrounded. When an Activity is in a backgrounded state (either after onPause or onStop) it can be destroyed at any time with no notice. In the event that the OS kills your Activity without killing your Application, the OS will first save your outState Bundle so you can later return to your previous state.
        (Intent can be used to transfer data from one java file to other file)
        -------------------------------
    STRING IS MUTABLE THAT IS WE CANT CHANGE STRING WHEN WE APPLIED OPERRAIONS ON STRINGS IT CREATED NEW OBJECT WHIUCH IS WASTE OF MEMORY , WHEREAS IN STRING BUFFER AND STRING BUILDER WE CAN CHANGE THEM WITHPOUT MAKING NEW OBJECT

    STRING BUILDER TAKES LESS TIME AND CALLS SIMULTANEOUS METHODS AS COMPARE TO STRING BUFFER .STRBUFER IS OLD.

    Difference between StringBuffer and StringBuilder

    There are many differences between StringBuffer and StringBuilder. A list of differences between StringBuffer and StringBuilder are given below:

    No.	StringBuffer	StringBuilder
1)	StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.	StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
        2)	StringBuffer is less efficient than StringBuilder.	StringBuilder is more efficient than StringBuffer.
    StringBuffer Example

    public class BufferTest{
        public static void main(String[] args){
            StringBuffer buffer=new StringBuffer("hello");
            buffer.append("java");
            System.out.println(buffer);
        }
    }
    hellojava


    StringBuilder Example

    public class BuilderTest{
        public static void main(String[] args){
            StringBuilder builder=new StringBuilder("hello");
            builder.append("java");
            System.out.println(builder);
        }
    }
    hellojava
    Performance Test of StringBuffer and StringBuilder

    Let's see the code to check the performance of StringBuffer and StringBuilder classes.

    public class ConcatTest{
        public static void main(String[] args){
            long startTime = System.currentTimeMillis();
            StringBuffer sb = new StringBuffer("Java");
            for (int i=0; i<10000; i++)
            {
                sb.append("Tpoint");
            }
            System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
            startTime = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder("Java");
            for (int i=0; i<10000; i++){
                sb2.append("Tpoint");
            }
            System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
        }
    }
    Time taken by StringBuffer: 16ms
    Time taken by StringBuilder: 0ms









    TYPES OF INTENT
    Explicit Intents :- (data pass using,startactivity, startactivityforresult)

    An explicit intent is most commonly used when launching an activity (from another one) within the same application. With them the component name is generally specified to which the intent has to be delivered. Without the component name Android decides which component (of which app) should receive the intent based on the intent information (especially action and data) passed, in which case it becomes an implicit intent that we’ll cover in a bit. Let’s see an example of an explicit intent right away:

// Currently in MainActivity

    Intent intent = new Intent(this, LoginActivity.class);
    startActivity(intent);
    In the example above we try to launch LoginActivity.java from MainActivity.java which is placed at the top of the activity stack. We instantiate the Intent class by passing the current context and the component’s name (being *explicit*) that needs to be started (launched). Then we call startActivity() and pass it our intent. This will simply launch the LoginActivity from the same application right over MainActivity. Think of how we click links or submit forms on the web to navigate to other web pages (urls). This concept of intents is somewhat analogous to that.

    Instead of specifying the component name directly in the Intent constructor, there are several other methods like setComponent(), setClass() or setClassName() on the same class that can be used to do the same:

// Currently in MainActivity

    Intent intent = new Intent();

    // Use setComponent()
    ComponentName componentName = new ComponentName(this, LoginActivity.class);
intent.setComponent(componentName);

// or setClass()

intent.setClass(this, LoginActivity.class);

// or setClassName()

intent.setClassName("com.pycitup.pyc", "com.pycitup.pyc.LoginActivity");

    startActivity(intent);
    Notice how we used the fully-qualified class/component name with setClassName(). That’s important!

    We can add data to our intent in key-value pairs that can be retrieved by the receiving activity.

// Currently in LoginActivity

    Intent intent = new Intent(this, MainActivity.class);
intent.putExtra("name", "rishabh");
intent.putExtra("age", 21);

    startActivity(intent);
    We just transferred two pieces of data, first one is string the other one is an integer. The key has to be of the type String. As values we can use the primitive data types (int, double, etc.) as well as objects of type CharSequence, String, Bundle, Parceable and Serializable. Let’s see how we retrieve this data when the new Activity is launched (inside onCreate() for instance).

// Currently in MainActivity

    Bundle extras = getIntent().getExtras();

if (extras != null)
    {
        String name = extras.getString("name");
        int age = extras.getInt("age");
    }
    So calling getExtras() on our Intent object gives us a [`Bundle`](http://developer.android.com/reference/android/os/Bundle.html) object on which we can call various methods like getString(), getInt(), getChar(), etc. to retrieve various values that were transmitted. Instead of working with bundles we could have also used methods on the Intent object like getStringExtra() and getIntExtra().
    For this entire explicit intents concept to work (that launches other components like Activity in our example) we’ll need to make sure that the activities are listed in AndroidManifest.xml (application manifest). Should be something like this:
    Sometimes you will want to get a result back from the launched activity’s end. For example, you launch an activity that lets the user pick a particular person from his contacts list or a particular image from the image gallery or maybe he just taps on the Android back button (that triggers finish()). When he’s done with choosing you want the reference data back so that you can do further actions or processing with his selection. In order to do this, instead of calling `startActivity()` we can call startActivityForResult(). Let’s see how to do that:
    Intent intent = new Intent(this, LoginActivity.class);
    startActivityForResult(intent, 1);
    The call to startActivityForResult() with a positive integer request code starts LoginActivity as the sub-activity of MainActivity. The integer request code passed as the second argument identifies the request. When we receive the result Intent from the sub-activity back, the same request code is also sent back so that we can properly identify the result and decide how to handle it.

        Let’s comprehend how to return the data to the parent activity (MainActivity) now. If you want to send some data back to the parent activity then this is what you’ve to do:

    Intent resultIntent = new Intent();
resultIntent.putExtra("result", "Excellent!");
    setResult(RESULT_OK, resultIntent);
    finish();

    If you don’t want to return any data back, then you could do this instead:

    Intent resultIntent = new Intent();
    setResult(RESULT_CANCELED, resultIntent);
    finish();
    The result codes RESULT_OK and RESULT_CANCELED basically means operation succeeded and canceled respectively. When the sub-activity crashes then also the parent activity receives a RESULT_CANCELED result code. The response code can be some other user defined custom value too, not just these.

    Time to see how the data reverted has to be handled in the parent activity. What we’ve to do is, override the onActivityResult() method in our parent activity. Note that this method is called immediately before onResume() when the activity is re-starting.


@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("result");
                Log.d(TAG, result);
            }

            if (resultCode == RESULT_CANCELED) {
                // Operation failed or cancelled. Handle in your own way.
            }
        }
    }
    The code is pretty straight forward but you’d be wondering what is the requestCode. If you remember we had passed a second argument to the startActivityForResult() call. This requestCode is the same integer value as that to help us identify the correct operation from which the resultCode came from. Hence, this helps when you’re dealing with firing up multiple sub-activites.

        Tip: Generally you should store your request code in a constant that can be reused. Something like this – private static final int REQUEST_CODE = 1;.

    Implicit Intents (Uri parse,open gallery,call)

    When we work with implicit intents, we generally specify the action that we want to be performed and optionally some data required for that action. Data is typically expressed as a Uri which can represent an image in the gallery or person in the contacts database for instance. An example will make this idea much more clearer.

// From MainActivity.onCreate()

    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
    startActivity(intent);
    So what we did was specify an action to perform which in this case is ACTION_VIEW that leads to the most reasonable thing to occur in this case based on the HTTP URI which is show the webpage in a browser. We sort of implied or suggested that the user wants to view google.com in/through the app. Now instead of showing the webpage in a WebView we decided to use another app (chrome browser for instance) that the system already ships with. So convenient!

    During an implicit intent, the Android system searches for all the registered components (through intent filters) for the specific action and data type (in this case an HTTP URI). If only one component is found, that is triggered but when several of them are identified a dialog is presented to the user from which he can make a suitable selection.

    In the receiving Activity you can get the action and data passed using getAction() and getData():


        Log.d(TAG, "Action: " + getIntent().getAction());

// getDataString() is the same as getData() but returns the URI as an encoded String
// whereas getData() returns a Uri object
Log.d(TAG, "Data: " + getIntent().getDataString());

/*
Should dump:
Action: android.intent.action.VIEW
Data: http://google.com
*/
    Let’s see another example of an implicit intent where the user might want to share a piece of data/text/update/message via apps like Facebook, Gmail, WhatsApp, Twitter, Snapchat, etc.


        Intent intent = new Intent(Intent.ACTION_SEND);
intent.setType("text/plain");
intent.putExtra(android.content.Intent.EXTRA_TEXT, "Standing on the Moon!");
    startActivity(intent);
    The standard action ACTION_SEND is used to send some data to another app. The documentation does an excellent job at explaining this action (which will make the example also crystal clear). Just to keep in mind, `setType()` is used to set the MIME type whereas putExtra() binds the data that has to be passed on for the sake of sharing.

    By default, when we pass a URI while creating our Intent object, the system determines the appropriate MIME type required by the intent (first example). When we don’t specify the URI (second example), we should use setType() to specify the type of data (MIME) associated with the intent. This data also helps Android in determining which kinds of activities (or other components) should receive the intent.

    With the code example above, what’ll happen is Android will present the user with a list of apps that he can use to share the text (facebook, gmail, whatsapp, etc.) from which he can choose one and infact the next time he can decide whether he wants to use a particular app always or not (if he prefers that most of the time). However, in this case the action is more of a social update (or “share) which probably means he should be given the ability to select a different app everytime, i.e., we should probably force a list everytime so that by mistake if he chooses an app that should be used always then he’ll have trouble getting the entire list again as that app will be used by default always. To do this, we can force the chooser dialog everytime with this piece of code:


    Intent intent = new Intent(Intent.ACTION_SEND);
intent.setType("text/plain");
intent.putExtra(android.content.Intent.EXTRA_TEXT, "Standing on the Moon!");

    Intent chooser = Intent.createChooser(intent, "Chooser Title!");

    startActivity(chooser);
    We create a new intent using Intent.createChooser() and pass that to startActivity(). Also if you notice you can set the title of the dialog that’ll show a list of different apps that can handle the intent action by passing it to createChooser() as the second argument.

    Determine If There is an App to Handle the Intent

    Although most of the times certain intents have registered components in other built-in apps (like gmail, facebook, phone, email, calendar, contact, etc.), it is still important that we verify whether there’s an app that can handle the intent or not before invoking it. This is because for some reason if there’s no matching app then the application will crash that could lead to unhappy users leaving negative feedbacks on the play store. Let’s see how to do this.

// This snippet can obviously be wrapped in a method call for easy reuse

    // Get the package manager
    PackageManager packageManager = getPackageManager();
    // Get activities that can handle the intent
    List<ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
    // Check if 1 or more were returned
    boolean isIntentSafe = activities.size() > 0;

if (isIntentSafe) {
    startActivity(intent);
}
    We get the PackageManager object on which we call the queryIntentActivities() method that gives us a list of matching activities. If the size of the list is more than 0 then we should go ahead else we should disable the feature that generates the intent or link the user to an app on the play store that can handle it.

    Feel free to go through the activities list. Here’s a snippet that’ll let you do that:

        for (int i = 0; i < activities.size(); i++)
    {
        String activity = activities.get(i).toString();
        Log.d(TAG, activity);
    }
    Difference between implicit and eplicit intents


    Android supports explicit and implicit intents. An application can define the target component directly in the intent (explicit intent) or ask the Android system to evaluate registered components based on the intent data(implicit intents).
    Explicit intents explicitly define the component which should be called by the Android system, by using the Java class as identifier. Explicit intents are typically used within an application as the classes in an application are controlled by the application developer. The following shows how to create an explicit intent and send it to the Android system to start an activity.
    Intent i = new Intent(this, ActivityTwo.class);
i.putExtra("Value1", "This value one for ActivityTwo ");
i.putExtra("Value2", "This value two ActivityTwo");
    Implicit intents specify the action which should be performed and optionally data which provides content for the action. If an implicit intent is sent to the Android system, it searches for all components which are registered for the specific action and the fitting data type. If only one component is found, Android starts this component directly. If several components are identified by the Android system, the user will get a selection dialog and can decide which component should be used for the intent.
    For example, the following tells the Android system to view a webpage. All installed web browsers should be registered to the corresponding intent data via an intent filter.
    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vogella.com"));
    startActivity(i);
----------------------------------
    Difference BETWEEN ARRAYLIST AND HASHMAP (DONS)
    Storage
    ArrayList stores the element’s value alone and internally maintains the indexes for each element.
    HashMap stores key & value pair. For each value there must be a key associated in HashMap. That clearly shows that memory consumption is high in HashMap compared to the ArrayList.
        -------------------------
    Order
    ArrayList maintains the insertion order while HashMap doesn’t. Which means ArrayList returns the list items in the same order in which they got inserted into the list.
while HashMap doesn’t.
-------------------------
    Duplicates:
    ArrayList allows duplicate elements
    but HashMap doesn’t allow duplicate keys
        (It does allow duplicate values).
        -------------------------
    Nulls:
    ArrayList can have any number of null elements.
    HashMap allows one null key and any number of null values.
----------------------------------------------------------------------------------------------------------------------------------------

    ANDROID VIEWPAGER EXAMPLE

    VIEWPAGER IS 1 ACTIVITY CONSISTING THREE TABS (TABHOST)

    USED TO SLIDE


    https://www.sitepoint.com/using-viewpager-to-create-a-sliding-screen-ui-in-android/



        ----------------------------------------------------------------------------------------------------------------------------------------

    ADAPTER IS BRIDGE BETWEEN DATA(ARRAYLIST,HASHMAP) AND UI (ListView)


    TYPES OF ADAPTER

        ARRAYADAPTER

    Whenever you have a list of single type of items which is backed by an array, you can use ArrayAdapter. For instance, list of phone contacts, countries or names.

        By default, ArrayAdapter expects a Layout with a single TextView, If you want to use more complex views means more customization in grid items or list items, please avoid ArrayAdapter and use custom adapters.

        --------


    BASEADAPTER

    BASEADAPTER IS USED FOR CUSTOMIZED LIST ITEMS (CUSTOM LIST VIEW )

--------

    LISTADAPTER


    LISTADAPTER FOR  DISPLAY ITEMS IN LISTVIEW

--------

    CURSOR ADAPTER

    CursorAdapter which binds directly to a result set from a Local SQLite Database and it uses a Cursor as it’s data source.


        CUSTOM ADAPTER

    http://www.journaldev.com/10416/android-listview-with-custom-adapter-example-tutorial


    Recycling Rows

    As a ListView is instantiated and the rows are populated such that the full height of the list is filled.
    After that no new row items are created in the memory.
    As the user scrolls through the list, items that leave the screen are kept in memory for later use and then every new row that enters the screen reuses an older row kept in the memory.

--------

    SIMPLE ADAPTER

    In Android, SimpleAdapter is an easy adapter to map static data to views defined in an XML file (layout).
    In android you can specify the data backing to a list as an ArrayList of Maps(hashmap or other).
    Each entry in a ArrayList is corresponding to one row of a list.
    The Map contains the data for each row.
    You also specify an XML file(custom list items file) that defines the views used to display the row, and a mapping from keys in the Map to specific views.

        ----------------------------------------------------------------------------------------------------------------------------------------




    RECYCLERVIEW
    https://www.youtube.com/watch?v=aZq099t-fJk

    In listview if we have suppose 1000 items then it will creates 1000 objs which is waste in memory ,whereas in recycler view  only 40-50 objs  will be created.
    In the lst displaying the items at a time are only created and one more item at bottom which will be reused to enter data of next entry.
    In list we we don't only have listitems but also we have header and footer to include in it .(In listview we have have only rows with listitems ,it is not like that)


    RECYCLERVIEW was added in lollipop version(to work on previous versions than lollipop need support library)


    STEPS OF RECYCLERVIEW :-

        1) ADD SUPPORT LIB FILE TO GRADLE


2) ADD RECYCLERVIEW IN XML(JUST LIKE WE ADD ANY OTHER E.g. ListView)


3) SPECIFY  LayoutMANAGER IN XML OR CODE(if not added then app crashes becoz it does not how items would be added)


4) INITIALIZE INSIDE THE ACTIVITY OR FRAGMENT (USING FINDVIEWBYID)


5)CREATE A Layout FILE TO DEFINE SINGLE ITEM INSIDE RECYCLERVIEW


6) CREATE AN ADAPTER THAT DESCIBE HOW TO DISPLAY THE DATA FOR EACH ITEM

-DATA SRC (XML,JSON,DB,ARRAYLIST)
-NO. OF ITEMS
-USE ONCREATEVIEW TO LINK ADAPTER WITH LAYOUT
-USE onBindViewholder to show data inside the adpter for each position
-Tell recyclerview to use adapter

--------
    http://www.vogella.com/tutorials/AndroidRecyclerView/article.html
        (FOR THEORY)

    A RecyclerView can be thought of as a combination of a ListView and a GridView.
        However, there are extra features that separate your code into maintainable components even as they enforce memory-efficient design patterns.
    WE CAN USE CARDVIEW IN IT.

    Recycler view uses a VIEWHOLDER reference views for one entry in the recycler view.
    A ViewHolder class is a static inner class in your adapter which holds references to the relevant views.
    With these references your code can avoid the time-consuming findViewById() method to update the widgets with new data.

    An adapter manages the data model and adapts it to the individual entries in the widget.
    It extends the RecyclerView.Adapter class and is assigned to the recycler view via the RecyclerView.setAdapter method.
    The input to the adapter of an recycler view can be any arbitrary Java objects.
    Based on this input the adapter must return the total number of items via its getItemCount() method.


        --------

    JSON,ADAPTER, RECYCLER VIEW, VOLLEY


    http://www.android-examples.com/android-recyclerview-listview-with-imageview-textview-json/






        ----------------------------------------------------------------------------------------------------------------

    MEMORY LEAKS

    This process is called garbage collection and the corresponding piece of JVM is called Garbage Collector, or GC. ...
    Simplifying a bit, we can say that a memory leak in Java is a situation where some objects are not used by application any more, but GC fails to recognize them as unused.

----------------------------------------------------------------------------------------------------------------
    ADD COLOR CODE IN LAYOUT XML FILE,NO NEED TO ADD IT IN COLORS.XML

    E.g.

<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="#FF0000"/>

        ----------------------------------------------------------------------------------------------------------------

    CHANGE MINSDK VERSION
    Select Android
    CLICK ON APP
    PRESS F4
    SEE IMAGE


    VIEWS  in android
    This class represents the basic building block for user interface components. A View occupies a rectangular area on the screen and is responsible for drawing and event handling. View is the base class for widgets, which are used to create interactive UI components (buttons, text fields, etc.). TheViewGroup subclass is the base class for layouts, which are invisible containers that hold other Views (or other ViewGroups) and define their layout properties.
        ----------------------------------------------------------------------------------------------------------------
    http://www.vogella.com/tutorials/AndroidFragments/article.html#validate-your-implementation

    https://developer.android.com/reference/android/app/Fragment.html

    FRAGMENT :-

    Lifecycle : - dev.android.com
onAttach()  means fragment has been added to the activity to use
    https://www.journaldev.com/9266/android-fragment-lifecycle

    onCreateView() The system calls this callback when it’s time for the fragment to draw its UI for the first time. 

// onviewcreated():- when using the adapter


    A fragment encapsulates functionality so that it is easier to reuse within activities and layouts.

    A fragment runs in the context of an activity, but has its own life cycle and typically its own user interface. It is also possible to define fragments without an user interface, i.e., headless fragments.


    Android devices exists in a variety of screen sizes and densities. Fragments simplify the reuse of components in different layouts and their logic. You can build single-pane layouts for handsets (phones) and multi-pane layouts for tablets. You can also use fragments also to support different layout for landscape and portrait orientation on a smartphone.
    As it is possible to dynamically add and remove fragments from an activity. The usage of fragments allows to design very flexible user interfaces.
    The typical example is a list of items in an activity. On a tablet you see the details immediately on the same screen on the right hand side if you click on item. On a smartphone you jump to a new detail screen. This is depicted in the following graphic.
1.3. Fragments and Context access
    Fragments don’t subclass the Context class. Therefore you have to use the getActivity()method to get the parent activity
    https://examples.javacodegeeks.com/android/core/app/fragment/android-fragments-example/

        ●A Fragment represents a portion of a user interface or an operation that runs within an Activity.

●A single activity can contain multiple fragments and many fragments can be reused in many, different activities.

        ●It is not wrong if we say that a fragment is a type of sub-activity that can be utilized again in multiple activities.

●Although each fragment has each own lifecycle, it is connected with the Activity it belongs to, so it’s lifecycle is directly influenced by the activity’s lifecycle.


    VIEWPAGER
    http://www.journaldev.com/10096/android-viewpager-example-tutorial

    ANDROID  SDK PATH
    https://stackoverflow.com/questions/25176594/android-sdk-location
    The Android SDK path is usually C:\Users\<username>\AppData\Local\Android\sdk.

    APPLY GETTER AND SETTER




    BOTTOMBAR



    http://www.truiton.com/2017/01/android-bottom-navigation-bar-example/






    CHECK RESPONSIVENESS OF WEBSITE
    GOTO MOZILLA BROWSER
    OPEN WEBSITE
    PRESS KEYS:- CTRL+SHFT+M

    ANDROID VERSIONS WITH CHANGES

    https://en.wikipedia.org/wiki/Android_version_history
    Android 5.0 Lollipop(API 21)

12,NOVENBER 2014
         
    Android Runtime (ART) with ahead-of-time (AOT) compilation and improved garbage collection (GC), replacing Dalvik that combines bytecode interpretation with trace-based just-in-time (JIT) compilation
    Support for 64-bit CPUs
●Support for print previews
●Material design, bringing a restyled user interface
●Lock screen provides shortcuts to application and notification settings[184]
        ●Recently used applications are remembered even after restarting the device.[184]
        ●Addition of 15 new languages: Basque, Bengali, Burmese, Chinese (Hong Kong), Galician, Icelandic, Kannada, Kyrgyz, Macedonian, Malayalam, Marathi, Nepali, Sinhala, Tamil and Telugu

●A flashlight-style application is included, working on supported devices with a camera flash.


    SOAP VS REST

        BSSFUP
    USE:-
    SOAP can't use REST because it is a protocol.	REST can use SOAP web services
    because it is a
    concept and can use any protocol
    like HTTP, SOAP.
    SOAP stands for Simple Object Access Protocol.	REST stands for REpresentational
    State Transfer.

    STANDARDS
    SOAP defines standards to be strictly followed.	REST does not define too much standards
    like SOAP.

    BANDWIDTH
    SOAP requires more bandwidth and resource than REST.	REST requires less bandwidth 
    and resource than SOAP.


    SECURITY
    SOAP defines its own security.	RESTful web services inherits security measures
 from  the underlying transport.

    FORMAT
    SOAP permits XML data format only.	REST permits different data format such
    as Plain text, HTML, XML, JSON etc.

    PREFFFERD

    SOAP is less preferred than REST.	REST more preferred than SOAP.




    ASYNCTASK

    http://www.journaldev.com/9708/android-asynctask-example-tutorial

    MENU AND  ITS TYPES

    https://www.javatpoint.com/android-option-menu-exampl



    LAYOUTINFLATE
    SHOWING A LAYOUT IN A LAYOUT AS VIEW OBJECT
    https://www.myandroidsolutions.com/2012/06/19/android-layoutinflater-turorial/

    DPI SP PIXEL

    https://www.youtube.com/watch?v=0CigkV5m6n4
    sp=used for fonts of texts
    dp =for everything other like views,objs,images etc.

        HTTPURLCONNECTION ADVANTAGES
●Light weight apis helps in easier management and reduces compatibility issues.
●Automatic handling of the caching mechanisms, with the help of HttpResponseCache.
        ●Reduces the network usage and also, the battery consumption.

    https://stackoverflow.com/questions/17432358/android-studio-logcat-nothing-to-show
    logcat nothing to show , dead

    write json in .java without api
    https://www.journaldev.com/10642/android-jsonobject-json-parsing


    NAVIGATION VIEW
import android.support.design.widget.NavigationView; // for readymade nav view to appear in screen

    android:fitsSystemWindows="true" not to overlap items in nav bar


    Toolbar : bar at the top of activity (e.g.Mainactivity)


    In xml & is written as &amp; or \u0026



    Android OREO FEATURES



    Autofill:
    With your permission, Autofill remembers your logins to get you into your favorite apps at supersonic speed.


        2x faster:
    Get started on your favorite tasks more quickly with 2x the boot speed when powering up* 
        *boot time as measured on Google Pixel
    Do two things at once, at once
    Picture-in-Picture:
    Allows you to see two apps at once, it's like having super strength and laser vision.


    Peace of mind in the palm of your hand

    Google Play Protect:
    Working to keep your device and data safe from misbehaving apps by scanning over 50 billion apps per day, even the ones you haven't installed yet!

        60 new emojis added





    ANDROID NOUGAT

  Multi-window view
  Quick switch between apps
  Multi Locale language settings
  Over 1500 emoji including 72 new ones



    Context class used for launchimg activitie ,receiving intents,broadcast





    www.androidinhindi.com,
    learnvern.com for tutorials android and free course


    old projects
    apk
    hr inrvw que
    android invr ques
    jav invr qus


    resm prnt

    suresh pwrbk with cble

    msme add net or not

        hhtpurlconn





    json parse
    chart prepare, about cny,maps direcn
    keyboard proj


    checkableBehavior 

    https://developer.android.com/guide/topics/ui/menus.html

    Using checkable menu items

    Figure 5. Screenshot of a submenu with checkable items.
    A menu can be useful as an interface for turning options on and off, using a checkbox for stand-alone options, or radio buttons for groups of mutually exclusive options. Figure 5 shows a submenu with items that are checkable with radio buttons.
        Note: Menu items in the Icon Menu (from the options menu) cannot display a checkbox or radio button. If you choose to make items in the Icon Menu checkable, you must manually indicate the checked state by swapping the icon and/or text each time the state changes.
    You can define the checkable behavior for individual menu items using the android:checkable attribute in the <item>element, or for an entire group with the android:checkableBehavior attribute in the <group> element. For example, all items in this menu group are checkable with a radio button:
    <?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
            <group android:checkableBehavior="single">
                <item android:id="@+id/red"
                      android:title="@string/red" />
                <item android:id="@+id/blue"
                      android:title="@string/blue" />
            </group>
</menu>
    The android:checkableBehavior attribute accepts either:



    // to change the appbar widgets, we can also change it in Android Manifest file  ,
    See Screenshot



    PAYPAL ANDROID INTEGRATION

    https://www.simplifiedcoding.net/android-paypal-integration-tutorial/

    Create two sandbox account(sandbox account is an demo account which is used for testing) we should have buyer and business acount on paypal

    create android studio project,get project name

goto paypal url link and paste the project name it will create  client id


    paste the client id to android project

    add  compile 'com.paypal.sdk:paypal-android-sdk:2.14.2' in app level gradle

    get amount to be transfer and start intent
--------

    class from paypal sdk
            create obj of Paypalconfiguration  class which has varibales like live environment,sandbox environment ,clientid

        call paypal service class







Where <requestFocus /> is that the cursor will be placed on that edittext on launch of activity or fragment.

    Super.onbackpress

    https://www.youtube.com/watch?v=6X_1WhPcmYU


    In the app, when you look at the long list of vendors and you scroll all the way down to click on a vendor, but when you click back you’re brought back to the top of the list instead of where you left off. This ruins the user’s experience because they have to scroll all the way to the bottom to see where they were before.

        Ques:- Go to previous activity without refreshing the first activity?

    Answer :-	Remove the code From android manifest and apply code


    android:parentActivityName=".BusinessListActivity"















    Aply code to java activity:-

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showVideosSwitch = (Switch) findViewById(R.id.switch_show_videos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this::showChoiceDialog);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == android.R.id.home)
        {
            onBackPressed(); // by default on back press

            //  Log.e("BusiDetAct", "onOptionsItemSelected: "+"onOptionsItemSelected" );

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    Ofb project


    ActionBar actionBar = getSupportActionBar();
actionBar.setDisplayHomeAsUpEnabled(true);
actionBar.setIcon(R.drawable.ic_about_us);

actionBar.setDisplayHomeAsUpEnabled(true);


    It shows the back icon at toolbar top


    https://developer.android.com/studio/publish/app-signing.html







        500 Internal server error is due to the tiemout OF REQUEST, wrong data type in parametre


    NEW FRAGMENT OPEN FROM LEFT TO RIGHT :-

        (transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);)












        27/FEB/2018


    NOTE : FRAGMENTS introduced in api level 11 android version 3.0 honeycomb.




    ACTIVITY LIFECYCLE :




    Activity is used to represent UI of app

    Oncreate is used to initilize the activity
















    Class in android java:-

    Instances of the class Class represent classes and interfaces in a running Java application. An enum is a kind of class and an annotation is a kind of interface.

    The primitive Java types (boolean, byte, char, short, int, long, float, and double), and the keyword void are also represented as Class objects.



    Difference between PRIMITIVE AND NON PRIMITIVE DATA

    Primitives are the most basic kinds of data types and they driectly contain values. There are eight primitive types in total:
        byte
short
int
long
char
boolean
float
Double

    Non primitive data types are called reference types in Java and they refer to an object. They are created by the programmer and are not defined by Java like primitives are. A reference type references a memory location where the data is stored rather than directly containing a value.
    difference between primitive and non primitive


    Get the class name:

    Getsimplename ()


    String sname = getClass().getSimpleName();
System.out.println("Class SimpleName = ++"+sname);

    difference between appcompatactivity and activity




    Android APK Signing Tool (APK Signer)


    https://shatter-box.com/knowledgebase/android-apk-signing-tool-apk-signer/




    ONLINE APK BUILD TOOLS

    https://snappy.appypie.com/index/app-download/app_id/052c613ba60e

        - - - - - -

    PUBLISH APP

    https://www.appypie.com/faqs/how-can-i-publish-my-android-app-by-myself


    https://snappy.appypie.com/user/app/





    https://developer.android.com/reference/android/content/Intent.html#FLAG_ACTIVITY_CLEAR_TOP


    If set, and the activity being launched is already running in the current task, then instead of launching a new instance of that activity, all of the other activities on top of it will be closed and this Intent will be delivered to the (now on top) old activity as a new Intent.
    For example, consider a task consisting of the activities: A, B, C, D. If D calls startActivity() with an Intent that resolves to the component of activity B, then C and D will be finished and B receive the given Intent, resulting in the stack now being: A, B.
    The currently running instance of activity B in the above example will either receive the new intent you are starting here in its onNewIntent() method, or be itself finished and restarted with the new intent. If it has declared its launch mode to be "multiple" (the default) and you have not set FLAG_ACTIVITY_SINGLE_TOP in the same intent, then it will be finished and re-created; for all other launch modes or if FLAG_ACTIVITY_SINGLE_TOP is set then this Intent will be delivered to the current instance's onNewIntent().
    This launch mode can also be used to good effect in conjunction with FLAG_ACTIVITY_NEW_TASK: if used to start the root activity of a task, it will bring any currently running instance of that task to the foreground, and then clear it to its root state. This is especially useful, for example, when launching an activity from the notification manager.
    See Tasks and Back Stack for more information about tasks.

        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);



    ANDROID CHANGE PACKAGE NAME

    PACKAGE NAME CHANGE CLASH WITH HOTSHELF

    https://stackoverflow.com/questions/4025369/how-to-change-package-name-of-an-android-application+

        1.Right-click on the package name (src/com.android.gesture.builder).
        2.Select Refactor > Rename and change the name, for example tocom.android.gestureNEW.builder.
3.Open the manifest file. Inside the <manifest> tag, change the package name tocom.android.gestureNEW.builder.
4.Open each of the two Activity files and do Ctrl-Shift-O to add missing import packages, then save each file. Run the GestureBuilder application on the emulator.















    In layout if we have set

    android:layout_margin="10dp"
    android:layout_marginBottom="10dp"

    It will total set total margin 10dp





        TABLAYOUT


    http://abhiandroid.com/materialdesign/tablayout-example-android-studio.html



    OPEN FRAGMENT FROM FRAGMENT


    Fragment secondfragment= new QuoteInfo();
    FragmentTransaction transaction = getFragmentManager().beginTransaction();
transaction.replace(R.id.fragment_container, secondfragment); // give your fragment container id in first parameter
transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
transaction.commit();











    Fragment

    https://developer.android.com/guide/components/fragments.html



    A Fragment represents a behavior or a portion of user interface in an Activity. You can combine multiple fragments in a single activity to build a multi-pane UI and reuse a fragment in multiple activities. You can think of a fragment as a modular section of an activity, which has its own lifecycle, receives its own input events, and which you can add or remove while the activity is running (sort of like a "sub activity" that you can reuse in different activities).
    A fragment must always be embedded in an activity and the fragment's lifecycle is directly affected by the host activity's lifecycle. For example, when the activity is paused, so are all fragments in it, and when the activity is destroyed, so are all fragments. However, while an activity is running (it is in the resumed lifecycle state), you can manipulate each fragment independently, such as add or remove them. When you perform such a fragment transaction, you can also add it to a back stack that's managed by the activity—each back stack entry in the activity is a record of the fragment transaction that occurred. The back stack allows the user to reverse a fragment transaction (navigate backwards), by pressing the Back button.
    When you add a fragment as a part of your activity layout, it lives in a ViewGroup inside the activity's view hierarchy and the fragment defines its own view layout. You can insert a fragment into your activity layout by declaring the fragment in the activity's layout file, as a <fragment> element, or from your application code by adding it to an existing ViewGroup. However, a fragment is not required to be a part of the activity layout; you may also use a fragment without its own UI as an invisible worker for the activity.
    This document describes how to build your application to use fragments, including how fragments can maintain their state when added to the activity's back stack, share events with the activity and other fragments in the activity, contribute to the activity's action bar, and more.

    The difference between getString() and optString() in Json

    https://stackoverflow.com/questions/13790726/the-difference-between-getstring-and-optstring-in-json




    As Diego mentions, it's a good idea to check the documentation (this link is now out of date - good thing we have the Wayback Machine!) before posting a question here, but now that you have:
    The difference is that optString returns the empty string ("") if the key you specify doesn't exist. getString on the other hand throws a JSONException. Use getString if it's an error for the data to be missing, or optString if you're not sure if it will be there.
    Edit: Full description from the documentation:
    Get an optional string associated with a key. It returns an empty string if there is no such key. If the value is not a string and is not null, then it is converted to a string.













        java.net.SocketException: Network is unreachable: connect

    You are facing a connection breakdown. Does this happen in 3G, WiFi or "plain" connection on a computer?
    Anyway, you must assume that the connection may be lost from time to time, when writing your app. For example, with mobiles, this happens frequently in the tube, in basements, etc. With PC apps, this is less frequent but occurs sometimes.
    A retry can be a good solution. And a clean error message that explains the network is not available at this moment too.




        .setDeniedMessage("If you reject the permission, You can't able to share these information.\n\n To turn on permissions Go to [Setting] > [Permission]")
.setPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE)








    steps to follow for android app development:-



    https://www.newgenapps.com/blog/bid/219838/10-steps-to-create-a-successful-mobile-application






    Replace fragment over a fragment

        // FragmentManager for operations on fragments
        //    getSupportFragmentManager retuen the fragments associated with activity
// FragmentTransaction remove fragment or add new fragment


        fragment = new FragmentTwo();

}

    // FragmentManager for operations
    //    getSupportFragmentManager return the fragments associated with activity
// FragmentTransaction remove fragment or add new fragment

    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.output, fragment);
                        transaction.commit();




                        Class which has atleat 1 abs () must be dec abs is call abs . if clas not dec abs then compil error.
                        Cant creat obj of abs clas.

                        A subclas of abs clas can be instantied only if all abs ()s are defined
                        OPEN

                        A TO A




                        F TO A




                        F TO F




                        A TO F

                        FragmentManager

                        FragmentManager manager = getFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.add(R.id.container,YOUR_FRAGMENT_NAME,YOUR_FRAGMENT_STRING_TAG);
                        transaction.addToBackStack(null);
                        transaction.commit();

                        -------------------------------------

                        DATA SEND AND RECEIVE

                        A TO A

                        Intwent it =new Intent(maniact.this,Secondactivty.class);
        it.putexra("key",val);

        String s = getIntent().getExtra("EXTRA_SESSION_ID");

        -------------------

        F TO A



        F TO F




        A TO F

        Bundle

        Bundle bundle = new Bundle();
        bundle.putString("edttext", "From Activity");
// set Fragmentclass Arguments
        Fragmentclass fragobj = new Fragmentclass();
        fragobj.setArguments(bundle);
        and in Fragment onCreateView method:

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState)
        {

        String strtext = getArguments().getString("edttext");
        return inflater.inflate(R.layout.fragment, container, false);
        }



        Is it possible to have a fragment without an activity?

        Fragment without activity not possible

        Fragments are part of the activity, so they cannot replace activity. Though they behave like activity, they cannot stand themselves. Its like view cannot itself act like activity.






        Pass object from one activity to another activity

        Intent intent = new Intent(this, NextActivity.class);
// using putExtra(String key, Parcelable value) method
        intent.putExtra(“parcel_data”, movie);
        startActivity(intent);
        Movie movie = (Movie) getIntent().getParcelableExtra("parcel_data");
/*

activity to activity

activity to fragment

fragment to activity

fragment to fragment

*/









        Android set button color in dialog box in java class programmtically


if (sendBtn.isEnabled())
        {
        sendBtn.setBackground(ContextCompat.getDrawable(c, R.drawable.solid_gray));
        sendBtn.setEnabled(false);
        }

        Open for business app


        String Pool


        As the name suggests, String Pool in java is a pool of Strings stored
        in Java Heap Memory.

        String pool helps in saving a lot of space for Java Runtime although
        it takes more time to create the String.



        String Pool

        As the name suggests, String Pool in java is a pool of Strings stored
        in Java Heap Memory.

        String pool helps in saving a lot of space for Java Runtime although
        it takes more time to create the String.

        When we use double quotes to create a String, it first looks for String
        with same value in the String pool, if found it just returns the reference
        else it creates a new String in the pool and then returns the reference.

        However using new operator, we force String class to create a new String
        object in heap space. We can use intern() method to put it into the pool
        or refer to other String object from string pool having same value.


        Five favourite things in android :-

        Call api ,volley,intent, parsing json,INTENTS ,VIEWPAGER.



        Android adapter class:-


        let suppose we have thousand contact to show it will show in some format. cant show 100 in list , 100 anywhere other in tab .

        so we need adapter class
Adapter acts as bridge between data and view on app ui.
        let suppose we have a data source(Json array, database , cursor,arraylist or any other thing).

        Adapter creates view from data.

        then show data in adpterview.

        Adapterviews:- View to display data on ui.
        Different Adapterviews are:- Listview , gridview, galleryview (galleryview wwas deprecated in android version 4.1).

        Adapterviews:- View to display data on ui.
        Different Adapterviews are:- Listview , gridview, galleryview (galleryview wwas deprecated in android version 4.1).
        Differnt types of data source :- arrayadpter.aarraylist , cursor







        Interface in java


// cant create obj of niether abstract class nor interface


        https://youtu.be/Yaa3QroWe7Q



        https://www.youtube.com/watch?v=Yaa3QroWe7Q



        getActivity() in a Fragment returns the Activity the Fragment is currently associated with. 
        Return the Activity this fragment is currently associated with.




        Context class :-


        As the name suggests, it's the context of current state of the application/object. It lets newly-created objects understand what has been going on. Typically you call it to get information regarding another part of your program (activity and package/application).



        Context ctx = (MainActivity) getActivity();

        getActivity().setTitle(getString(R.string.title_activity_Notification));


        myFragmentContext = getActivity();

        SharedPreferences pref = getActivity().getSharedPreferences("configureView", getActivity().MODE_PRIVATE);
        Picasso.with(this).load("www.journaldev.com").placeholder(R.drawable.placeholder).into(imageView);


        ANDROID STUDIO 3 FEATURES

        Better Layout Editor
        Compatibility with Java 8
        Support for Kotlin language
        Support for Android Things The Internet of Things (IoT) ma
        Faster build times


        MAPS :-

        SET MARKER ON PROVIDED LAT LONG
        SAME FOR MARKER ON PROVIDED LAT LONG FOR MULITIMPLE LOCS

        GET USSER CURRENT LOCATION

        CHECK PERMISSION
        LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 5, this);
        In requestLocationUpdates() method the 2nd argument is time in milliseconds and 3rd argument is distance in meters. Here I have used 5000 and 5 that means after every 5 seconds and 5 meter the current location is fetched.
        DRAW PATH

// Drawing polyline in the Google Map for the i-th route
        mMap.addPolyline(lineOptions);

        String url = "https://maps.googleapis.com/maps/api/directions/" + output + "?" + parameters;



        ON LOCATION CHANGED.
        requestLocationUpdates



        CONSTRAINTLAYOUT added Android Studio 2.2.
        ANDROID CONVERT JAVA CODE TO KOTLIN


        https://kotlinlang.org/docs/tutorials/kotlin-android.html

        How to convert a kotlin source file to a java source file

        1.Menu > Tools > Kotlin > Show Kotlin Bytecode
        2.Click on the Decompile button
        3.Copy the java code










        ConstraintLayout

        ConstraintLayout allows you to create large and complex layouts with a flat view hierarchy
        (no nested view groups).
        CL aims to make developing layouts easier & faster while improving
        performance at runtime.
        Speed!!! In many ways, the development of CL and the new LE are all about speed. One of the
        benefits of CL is its ability to help developers avoid the need to nest ViewGroups,
        in particular, weighted LinearLayouts and RelativeLayouts. The reason to avoid nesting is  because the rendering time can grow exponentially with each level of nesting. If the layout  time grows too large, your app will start dropping frames; resulting in choppy transitions.
        It involves simple drag and drop View widgets from the Palette to the designer editor.

        https://inducesmile.com/android/android-constraintlayout-example-tutorial/

        https://developer.android.com/training/constraint-layout/



        COORDINAOTR LAYOUT
        ADVANCEMENT OF FRAMELAYOUT
        CAN CONTAIN MULTIPLE CHILDS
        ADJUSTS FLOATING ACTION BAR POSITION WHEN SNACKBAR OCCURS.

        https://www.androidauthority.com/using-coordinatorlayout-android-apps-703720/

        Ctrl+alt+left for back
        In Android studio

        GSON for converting json to java objects.
        And vice versa.

        https://www.javacodegeeks.com/2011/01/android-json-parsing-gson-tutorial.html



        Weal vs strong refernce java
        https://www.geeksforgeeks.org/types-references-java/

        STRIPE PAYMENTS

        Steps for Stripe Payments Android :-

        Create account at stripe and get publishable and secret keys from their Card
        Add stripe sdk in project (library dependency)
        Get Card  info from user and validate card data like card number , expiry date cvv etc.
        through class Card(import com.stripe.android.model.Card)
        if card is valid then generate token with "card info" and "publishable key"
        and if publishable key is valid then token is created by stripe class.
        Get token from Token cardToken.getId()

        ADD DEPENDENCY

        implementation 'com.stripe:stripe-android:6.1.2'


        Collecting credit card information USING CardInputWidget(INBUILT ui OF STRIPE)
        This will allow your customers to input all of the required data for their card: the number, the expiration date, and the CVC code.
        Creating tokens
        The next step is to pass off that sensitive payment information securely to Stripe, where you’ll exchange it for a token. You can create tokens using the Stripe instance method createToken, passing in a Card instance, and completion callbacks. 
        -



        https://stripe.com/docs/keys

        API Keys
        Manage your API keys to authenticate requests with Stripe.
        Stripe authenticates your API requests using your account’s API keys. If you do not include your key when making an API request, or use one that is incorrect or outdated, Stripe returns an error.
        Every account is provided with two pairs of keys: one for testing and one for running live transactions. All API requests exist in either test or live mode, and objects—customers, plans, coupons, and so forth—in one mode cannot be manipulated by objects in the other.
        There are also two types of API keys: publishable and secret.
        Publishable API keys are meant solely to identify your account with Stripe, they aren’t secret. In other words, they can safely be published in places like your Stripe.js JavaScript code, or in an Android or iPhone app. Publishable keys only have the power to create tokens.
        Secret API keys should be kept confidential and only stored on your own servers. Your account’s secret API key can perform any API request to Stripe without restriction.
        Obtaining your API keys
        Your API keys are always available in the Dashboard. For your convenience, your test API keys for your account are:
        KEY	VALUE
        Publishable	pk_test_9u5noavTz5PlqOzKDJtFS01T
        Secret	sk_test_qwGBG8hBOyO7Pw1QTylLCW3N
        Stripe automatically populates code examples in our documentation with your test API keys while you are logged in—only you can see these values.
        Only use your test API keys for testing and development. This ensures you don't accidentally modify your live customers or charges.
        If you cannot see your API keys in the Dashboard, this means you do not have access to them. Contact your Stripe account’s owner and ask to be added to their team as a developer.
        Test and live modes
        Viewing test data
        You can view test data by toggling the View test data option in the Dashboard.
        The test and live modes function almost identically, with a few necessary differences:
        In test mode, payments are not processed by card networks or payment providers, and only our test payment information can be used
        Some payment methods using Sources have a more nuanced flow in live mode, with more steps required than those in test mode
        Disputes also have a more nuanced flow in live mode, and a simpler testing process
        Webhooks that were not successfully received are retried for up to five hours (as opposed to 72 hours for live mode)
        Keeping your keys safe
        Your secret API key can be used to make any API call on behalf of your account, such as creating charges or performing refunds. You should only grant access to your API keys to those that need them. Ensure they are kept out of any version control system that you may be using.
        Rolling keys
        If an API key is compromised, roll the key in the Dashboard to block it and generate a new one.

        Rolling an API key.
        When rolling an API key, you can choose to block the old key immediately or allow it to work for 12 hours, providing you with time to make the transitions. In either case, the new key can be used immediately.


        PARCELABLE ANDROID
         Parcelable is well documented in the Android SDK.
        In Parcelable, developers write custom code for marshaling and unmarshaling so it creates less garbage objects in comparison to Serialization. The performance of Parcelable over Serialization dramatically improves (around two times faster), because of this custom implementation.
        Serialization is a marker interface, which implies the user cannot marshal the data according to their requirements. In Serialization, a marshaling operation is performed on a Java Virtual Machine (JVM) using the Java reflection API. This helps identify the Java objects member and behavior, but also ends up creating a lot of garbage objects. Due to this, the Serialization process is slow in comparison to Parcelable.


        ((TextView) billingView.findViewById(R.id.addBookfirstnameValue)).setText(accountDetailsResponse.getString("b_firstname"));

        Android Generate Hash key in android studio

        https://stackoverflow.com/questions/27609442/how-to-get-the-sha-1-fingerprint-certificate-in-android-studio-for-debug-mode




        11:45:54 AM: Executing task 'signingReport'...

        Executing tasks: [signingReport]

        Configuration on demand is an incubating feature.
        :app:signingReport
        Variant: debugUnitTest
        Config: debug
        Store: C:\Users\esteplogic-android\.android\debug.keystore
        Alias: AndroidDebugKey
        MD5: C7:7C:7C:4B:F9:6C:E1:4A:EF:26:29:12:B4:FF:F7:6C
        SHA1: 81:88:D5:43:9B:FE:80:70:DD:06:4D:68:20:1E:AC:66:FD:DA:85:2D
        Valid until: Sunday, February 9, 2048
        ----------
        Variant: debugAndroidTest
        Config: debug
        Store: C:\Users\esteplogic-android\.android\debug.keystore
        Alias: AndroidDebugKey
        MD5: C7:7C:7C:4B:F9:6C:E1:4A:EF:26:29:12:B4:FF:F7:6C
        SHA1: 81:88:D5:43:9B:FE:80:70:DD:06:4D:68:20:1E:AC:66:FD:DA:85:2D
        Valid until: Sunday, February 9, 2048
        ----------
        Variant: release
        Config: none
        ----------
        Variant: debug
        Config: debug
        Store: C:\Users\esteplogic-android\.android\debug.keystore
        Alias: AndroidDebugKey
        MD5: C7:7C:7C:4B:F9:6C:E1:4A:EF:26:29:12:B4:FF:F7:6C
        SHA1: 81:88:D5:43:9B:FE:80:70:DD:06:4D:68:20:1E:AC:66:FD:DA:85:2D
        Valid until: Sunday, February 9, 2048
        ----------
        Variant: releaseUnitTest
        Config: none
        ----------

        BUILD SUCCESSFUL in 0s
        1 actionable task: 1 executed
        11:45:55 AM: Task execution finished 'signingReport'.




        https://www.androidhive.info/2014/02/android-login-with-google-plus-account-1/
        Also check done projects for example.
        1.Installing / updating Google Play Services  in Android SDK manager.
        2 Generating Google-Services.json at developer console(for hash key see above section)
        3. Creating New Project

        3.2. Open project level build.gradle and add ‘com.google.gms:google-services:3.0.0’ class path to dependencies.

        Project level:-
        dependencies {
                classpath 'com.android.tools.build:gradle:2.1.0'
                classpath 'com.google.gms:google-services:3.0.0'
            }

        App level:-
        dependencies {
            // ..
            compile 'com.google.android.gms:play-services-auth:9.2.1'
         
            // glide is added to load the g+ profile image. Ignore if you want
            compile 'com.github.bumptech.glide:glide:3.7.0'
        }
         
        apply plugin: 'com.google.gms.google-services'

        4 Create
        activity_main.xml



        4 Create MainActivity.java


        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
        .requestEmail()
        .build();


        GoogleApiClient.Builder

        GoogleSignInAccount acct = result.getSignInAccount();

        https://github.com/RahulJanagouda/StatusStories









        Android Nine Patch Image

        Saved with extension (.9.png)
        Nine patch images are the resizable images that adjust the image view content according to screen resolution.
        Normal png looks ugly when stretched so thats why we need 9 patch png image.

        Activities
        Broadcast Recevires
        Content providers
        Services

        Examples of service class :- Network calls, downloading, music, audio play, notiification.
        https://www.concretepage.com/android/android-start-stop-service-from-activity-example-using-handlerthread



        START_STICKY: If the Service process is terminated by the system, the Service is going to be restarted and no processed Intents will be delivered to the onStartCommand function. When no start Intents are pending for delivery, a null Intent is passed to the onStartCommand function. If a start request didn't return before the system kills the Service, the start request is submitted again on the restarted Service passing START_FLAG_RETRY on the onStartCommand second argument.

        START_NOT_STICKY: If the Service is terminated by the system, the Service is only restarted when there is at least one pending start request to be delivered.

        Sticky Service :- Try to recreate service

        Non Sticky Service :- Try to restart service in where is it left with atleast one pending intent.



        PendingIntent :-


        voteaccepted
        A PendingIntent is a token that you give to a foreign application (e.g. NotificationManager, AlarmManager, Home Screen AppWidgetManager, or other 3rd party applications), which allows the foreign application to use your application's permissions to execute a predefined piece of code.
        If you give the foreign application an Intent, it will execute your Intent with its own permissions. But if you give the foreign application a PendingIntent, that application will execute your Intent using your application's permission.




        Android P features Version 9, API level 28

        Indoor Navigation :- This new feature enables indoor GPS style tracking by determining your location within a building and facilitating turn-by-turn directions to help you navigate indoors.


        Instead of three buttons set on the home screen, there is an option to use a new single home button that allows you to swipe up to view recent apps along with a UI that suggests apps you might use. Swiping the button left and right lets you quickly switch between apps.


        One of them is ‘Dashboard’ which breaks downs phone usage data to show how you spend time on your device. It displays:
        a pie chart indicating the time spent in each app per day and also in hour by hour basis
        total number of hours spent on the phone each day
        number of times you unlocked your phone
        total number of notifications you have received















        https://www.journaldev.com/14748/android-textinputlayout-example


        Android TextInputLayout Features

        Enabling/Disabling floating hints



        Note:-
        Whenever you change the orientation, your Activity gets recreated and hence the fragment hosted within your Activity gets recreated and so your fragments entire lifecycle methods are getting called again.







        contentvalues

        Creates an empty set of values using the default initial size






        Android Intent.FLAG_ACTIVITY_SINGLE_TOP AND Intent.FLAG_ACTIVITY_CLEAR_TOP


        FLAG_ACTIVITY_SINGLE_TOP
        For example, consider a task consisting of the activities: A, B, C, D. If D calls startActivity() with an Intent that resolves to the component of activity B, then C and D will be finished and B receive the given Intent, resulting in the stack now being: A, B.


        OPEN

        A TO A




        F TO A




        F TO F



        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.replace(R.id.fragment_container, newfragobj);
        transaction.addToBackStack(null);

        transaction.commit();



        A TO F

        FragmentManager

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container,YOUR_FRAGMENT_NAME,YOUR_FRAGMENT_STRING_TAG);
        transaction.addToBackStack(null);
        transaction.commit();

        -------------------------------------

        DATA SEND AND RECEIVE

        A TO A

        Intwent it =new Intent(maniact.this,Secondactivty.class);
        it.putexra("key",val);

        String s = getIntent().getExtra("EXTRA_SESSION_ID");

        -------------------

        F TO A

        Intent intent = new Intent(getActivity(), MainActivityList.class);
        startActivity(intent);



        F TO F

        Bundle args = new Bundle();
        args.putString("media", "l");
        followus.setArguments(args);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.replace(R.id.fragment_container, followus);
        transaction.addToBackStack(null);

        transaction.commit();


        A TO F

        Bundle

        Bundle bundle = new Bundle();
        bundle.putString("edttext", "From Activity");

// set Fragmentclass Arguments
        Fragmentclass fragobj = new Fragmentclass();
        fragobj.setArguments(bundle);
        and in Fragment onCreateView method:

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState)
        {
        String strtext = getArguments().getString("edttext");
        return inflater.inflate(R.layout.fragment, container, false);
        }




        Array vs Arraylist

        Size of array is calculated thru .length()
        Size of arraylist is calculated thru .size()

        Array can contain both primitive type and object type data
        Arraylist can contain only  object type data

        Array is fixed size data strucutre
        Size of Arraylist is not fixed.

        Array is basic functionality of java
        Arraylist is  functionality of collection framework


        All Countrylist API
        http://api.geonames.org/childrenJSON?geonameId=1264418&username=demo


        BroadcastReceiver 
        When any of these events occur it brings the application into action by either creating a status bar notification or performing a task.

        Unlike activities, android Broadcast Receiver doesn’t contain any user interface. Broadcast receiver is generally implemented to delegate the tasks to services depending on the type of intent data that’s received.

        https://www.journaldev.com/10356/android-broadcastreceiver-example-tutorial

        E.g Push notification , download complete, low battery etc.
        The onReceiver() method is first called on the registered Broadcast Receivers when any event occurs.


        Pojo class Rules:-

        Class should be public.

        Properties shud be pvt

        Every property shud hav public getter and setter

        Public default ctor is mandatory



        Retrofit is by square.
        Retrofit is third party library to call api's.
        1.) Integrate two libraries i.e.GSOn for converting json to java objects and other is Retrofit  For the network calls.
        Create a class and store the URL.
        Now create and interface and implement the methods.




//    @GET("marvel")
        //  Call<List<Hero>> getHeroes();


        Call is callback ,
        List is datatype,
        Hero is pojo class name,
        //    getHeroes()

        curly braces are used for dynamic data



        0down vote
@Path is used when you have url which has '/' dynamic value after a backword slash.Example "http://google.com/index.html/userid. So in this url /userid is dynamic so to access this url your request should be @Get("index.html/{userid}") Calldata(@Path("userid")int id);
@Query is used when you have a url which has '?' dynamic value after a question mark.Example "http://google.com/index.html?userid.So聽in this url ? userid is dynamic so to access this url your request should be @Get("index.html") Calldata(@Query("userid")int id);





        dependency:- compile 'com.squareup.retrofit2:retrofit:2.3.0'
        compile 'com.squareup.retrofit2:converter-gson:2.2.0'

        2.) Creating API Interface :- Need a java interface where we define all the URLs with the http request type and parameters.

        //Creating a retrofit object
        Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(Api.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
        .build();

        //creating the api interface
        Api api = retrofit.create(Api.class);

        //now making the call object
        //Here we are using the api method that we created inside the api interface
        Call<List<Hero>> call = api.getHeroes();

        //then finallly we are making the call using enqueue()
        //it takes callback interface as an argument
        //and callback is having two methods onRespnose() and onFailure
        //if the request is successfull we will get the correct response and onResponse will be executed
        //if there is some error we will get inside the onFailure() method
        call.enqueue(new Callback<List<Hero>>() {
@Override
public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {

        //In this point we got our hero list
        //thats damn easy right ;)
        List<Hero> heroList = response.body();

        //now we can do whatever we want with this list

        }

@Override
public void onFailure(Call<List<Hero>> call, Throwable t) {
        Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
        }
        });



        FOR TESTING OF VARIOUS API’S:-

        https://reqres.in/



        android parse json array without key
        Sample json:-
        "product_gst": [
        "GST - 12%",
        "GST - 12%",
        null
        ],

        JSONArray    itemArray =    mainObject.getJSONArray("product_gst");

        try {
        // jsonString is a string variable that holds the JSON
        //  JSONArray itemArray=new JSONArray(jsonString);
        for (int i = 0; i < itemArray.length(); i++) {
        String value=itemArray.getString(i);
        Log.e("jsonval_GST+", i+"="+value);
        }
        } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }





        What is AppCompat?

        When new versions of android is published, Google will have to support the older versions of android. So AppCompat is a set of support libraries which can be used to make the apps developed with newer versions to work with older versions.
        For example: When you create an android project with minimum Api level 9, and target api level 21, The newer features like ActionBar, Drawer Menu (Newer in the sense of which were not present in Api 9) etc should also be supported in the Api Level 10 phones. Then you can use the appCompat library. So the android actionbar will becomes, androidsupport actionbar/ supportFragment etc.



        Create project of Android studio
        Register project at the firebase console using appid and get googleservices.json file
        Enable login authentication from dashboard
        CHECK:- PROJECTS\DONE\LOGIN OF FIREBASE DONE
        Integrate dependencies at both gradle level (app level and project level) :-
        classpath 'com.google.gms:google-services:4.0.0'

        implementation 'com.google.firebase:firebase-core:16.0.0'
        implementation "com.google.firebase:firebase-auth:16.0.2"


        Create reference variable of FirebaseAuth class:- FirebaseAuth auth;

        Call getInstance()  of it:- auth = FirebaseAuth.getInstance();



        finish() :-

        When calling finish() on an activity, the method onDestroy() is executed this method can do things like:
        1.Dismiss any dialogs the activity was managing.
        2.Close any cursors the activity was managing.
        3.Close any open search dialog

        Now I can't imagine situation when C can call finish() when D activity exists and I don't even know if It is possible but technically finish() finishes only current opened activity to finish D activity from C you can use: finishActivity()

        Types of Services :-
        Start Service:-
        A service is started when component (like activity) calls startService() method, now it runs in the background indefinitely. 
        https://www.tutorialspoint.com/android/android_services.htm

        Abstract class vs Interface
        1.Type of methods: Interface can have only abstract methods. Abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.
        2.Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
        3.Type of variables: Abstract class can have final, non-final, static and non-static variables. Interface has only static and final variables.
        4.Implementation: Abstract class can provide the implementation of interface. Interface can’t provide the implementation of abstract class.
        5.Inheritance vs Abstraction: A Java interface can be implemented using keyword “implements” and abstract class can be extended using keyword “extends”.
        6.Multiple implementation: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
        7.Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.

        */

}
