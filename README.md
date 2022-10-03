# application-lifecycle-observer-sample

This is a sample project created as part of this [Stackoverflow question](https://stackoverflow.com/questions/73892747/lifecycleobserver-oncreate-is-not-called-when-application-is-created) I raised 
in an attempt to isloate the issue I encounted with the `LifecycleObserver.onCreate(owner: LifecycleOwner)` not being called when obsering the Application lifecycle in particalar when the applicaion is created. 

It consists of 3 classes with log statements  

* `ApplicationLifecycleObserver` - my Observer that logs onCreate, onStart and onStop
* `MyApplication` - registers the `ApplicationLifecycleObserver` to the `ProcessLifecycleOwner` and logs when onCreate called
* `MainActivity` - empty activity which logs when onCreate called

However, as shown in the screen shot below this is behaved as expected. Therefore the issue I'm seeing in a production app could be related to something else :thinking:


![My Lifecycle Aware Application – ApplicationLifecycleObserver kt  My_Lifecycle_Aware_Application app main  2022-10-03 at 12 55 58 pm](https://user-images.githubusercontent.com/404105/193571466-9042007f-d440-493f-adab-001840e249de.jpg)
