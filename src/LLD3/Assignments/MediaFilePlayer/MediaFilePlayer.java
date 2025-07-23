package LLD3.Assignments.MediaFilePlayer;

/*

Media File Player (Assignment)

Problem Statement
You are tasked with implementing a media player application that supports playing different types of media files,
 including audio and video. Each media file type requires specific implementations to play them properly.
 Your goal is to create a method named playMedia within the MediaFilePlayer class that can accept various types of media files (either audio or video)
 and play them using runtime polymorphism.

Instructions
1.  Implement a method named playMedia within the MediaFilePlayer class.
2.  The playMedia method should accept a parameter representing a media file. The parameter type should be generic
    to allow for flexibility in accepting different types of media files.
3.  The playMedia method should print the details of the media file, such as title, artist (for audio),
    and duration (for video), before playing the media file.
4.  Ensure the playMedia method demonstrates runtime polymorphism by appropriately calling the play method
    specific to each type of media file.

 */

public class MediaFilePlayer {

    // Todo: Implement a method called playMedia
    // The play media will print the details of the file and then call the play method.
    // that demonstrates run-time polymorphism

    public static void playMedia(MediaFile mediaFile) {
        // Your code here
        System.out.println(mediaFile.getDetails());
        mediaFile.play();
    }

    public static void main(String[] args) {
        MediaFile audioFile = new AudioFile("Song Title", "Sonu Nigam", "audio.mp3");
        MediaFile videoFile = new VideoFile("Video Title", "video.mp4","30");

        playMedia(audioFile);
        playMedia(videoFile);
    }
}
