public class Main {

    public static void main(String[] args){
        var textBlock = """
                <person>
                    <firstName>Bimal</firstName>
                    <lastName>Vasan</lastName>
                    <age>35</age>
                </person>
                """.trim().toUpperCase();

        System.out.println(textBlock);

        System.out.println("--------------------------------------");

        String json = """
            {
                "id": 101,
                "name": "Bob",
                "skills": ["Java", "Python", "SQL"]
            }
            """;

        System.out.println(json);

        System.out.println("--------------------------------------");

        String special = """
            First line
            Second line\nThird line (with \\n)
            He said: \"Java is cool!\"
            """;

        System.out.println(special);

        System.out.println("--------------------------------------");

        String html = """
                  <html>
                      <body>
                          <p>Hello World.</p>
                      </body>
                  </html>
        """;

        System.out.println(html);

        System.out.println("--------------------------------------");

        String tricky = """
            This is a triple quote: \"\"\"
            And it's inside a text block!
        """;

        System.out.println(tricky);

        System.out.println("--------------------------------------");

        String escape = """
        Before " "
        Then "" and finally \"""
        """;

        System.out.println(escape);

        System.out.println("--------------------------------------");

        String name = "Bob";
        String message = """
            Dear %s,
            Your subscription will expire soon.
        """.formatted(name);

        System.out.println(message);

        System.out.println("--------------------------------------");
    }
}
