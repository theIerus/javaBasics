package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class Imagine implements CompactDisc{
    public void play() {
        System.out.println("I'm fine without you now, I've given you my heart.");
    }
}
