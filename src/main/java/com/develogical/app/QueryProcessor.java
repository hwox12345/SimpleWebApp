package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("coleridge")) {
            return "Samuel Taylor Coleridge (21 October 1772 - 25 July 1834) was an " +
                    "English poet, literary critic, philosopher and theologian who, with" +
                    "his friend William Wordsworth, was a founder of the Romantic Movement " +
                    "in England and a member of the Lake Poets.";
        }
        return "";
    }
}
