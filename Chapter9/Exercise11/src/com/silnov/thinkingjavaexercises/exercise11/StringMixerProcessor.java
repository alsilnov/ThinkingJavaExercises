package com.silnov.thinkingjavaexercises.exercise11;
interface Processor {
    public String name();
    public Object process(Object input);
}
class Apply {
    public static void process(Processor p, String s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
class StringMixer {
    public String process(String str) {
        char[] ch = new char[str.length()];
        for(int i = 0; i < str.length() - 1; i += 2) {
            //char tmp = ch[i];
            ch[i] = str.charAt(i + 1);
            ch[i + 1] = str.charAt(i);
        }
        if(str.length() % 2 != 0) {
            ch[str.length() - 1] = str.charAt(str.length() - 1);
        }
        return new String(ch);
    }
}
class StringMixerAdapter implements Processor {
    StringMixer mix;
    StringMixerAdapter(StringMixer mix) {
        this.mix = mix;
    }
    public String name() {
        return "StringMixerAdapter";
    }
    public String process(Object str) {
        return mix.process((String)str);
    }
}
public class StringMixerProcessor { 
    public static void main(String[] args) {
        Apply.process(new StringMixerAdapter(new StringMixer()), "12345678");
    }
}