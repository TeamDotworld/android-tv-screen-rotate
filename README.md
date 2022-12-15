# @teamdotworld/android-tv-screen-rotate

## Sample Usage

Changing Android TV Orientation

Declare the layout in XML

```
<?xml version="1.0" encoding="utf-8"?>
<dev.dotworld.rotatelayout.RotateLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
   >

 // your child goes here   

</dev.dotworld.rotatelayout.RotateLayout>
```

## 1. Change orientation using XML attribute

```
app:angle="90"
```

## 2. Change orientation using programmatically

```
binding.rotateLayout.angle = 90
```

