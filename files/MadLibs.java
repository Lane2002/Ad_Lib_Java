public class MadLibs {
    /*
     * This program generates a mad libbed story.
     */
    public static void main(String[] args) {
        String name1 = "John";
        String name2 = "Jane";
        String adjective1 = "large";
        String adjective2 = "strange";
        String adjective3 = "small";
        String noun1 = "frame";
        String noun2 = "pillow";
        String noun3 = "lamp";
        String noun4 = "sun";
        String noun5 = "mouth";
        String noun6 = "house";
        String place1 = "Paris";
        String verb1 = "sneeze";
        int number = 7;

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1
                + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}