IntentService
=============

###Description:
This is a simple application sample that shows the use of IntentService and BroadCastReceiver to get a heavy task performed in the background. The actual implementation of the heavy lifting task is sleeping for 4 seconds. The flow is that a message can be sent to the service which waits 4 seconds and echoes the message back to the required activity.