package com.exercises;

import java.util.Scanner;

public class E35_Hangman
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {

        String[] words = createWords();

        do
        {
            int randIndex = (int) (Math.random() * words.length);
            char[] wordLetters = words[randIndex].toCharArray();
            char[] mask = new char[wordLetters.length];
            int missedCounter = 0;
            int disclosedCounter = 0;

            for (int i = 0; i < wordLetters.length; i++)
                mask[i] = '*';


            do
            {
                System.out.print("Enter a letter in word: ");
                printMask(mask);
                System.out.print(" > ");
                char letter = input.nextLine().charAt(0);

                int r = searchLetter(wordLetters, mask, letter);
                if (r < 0)
                    System.out.printf("\t%c is already in the word\n", letter);
                else if (r == 0)
                {
                    System.out.printf("\t%c is not in the word\n", letter);
                    missedCounter++;
                }
                else
                    disclosedCounter += r;
            } while (disclosedCounter < wordLetters.length);

            System.out.print("The word is: ");
            printMask(mask);
            System.out.printf("\nYou missed %d %s \n\n", missedCounter,
                    missedCounter > 1 ? "times" : "time");


        } while (wantToPlayMore());
    }

    private static int searchLetter(char[] wl, char[] mk, char letter)
    {
        // return x:
        // x < 0  => letter was already found
        // x => 0  => number of letters disclose

        int foundCounter = 0;

        for (int i = 0; i < wl.length; i++)
        {
            if (wl[i] == letter)
            {
                if (mk[i] == letter)
                    return -1;
                else
                {
                    mk[i] = letter;
                    ++foundCounter;
                }
            }
        }

        return foundCounter;
    }

    private static void printMask(char[] gl)
    {
        for (char c : gl )
            System.out.print(c);
    }

    private static boolean wantToPlayMore()
    {
        do
        {
            System.out.print("Do you want to guess another word? Enter y or n>");
            String ans = input.nextLine();
            switch (ans.toLowerCase())
            {
                case "y":
                    return true;
                case "n":
                    return false;
            }
        } while (true);
    }

    private static String[] createWords()
    {
        return new String[]{"aberration",
                "abject",
                "abjure",
                "abnegation",
                "abrogate",
                "abscond",
                "abstruse",
                "accede",
                "accost",
                "accretion",
                "acumen",
                "adamant",
                "admonish",
                "adumbrate",
                "adverse",
                "advocate",
                "affluent",
                "aggrandize",
                "alacrity",
                "alias",
                "ambivalent",
                "amenable",
                "amorphous",
                "anachronistic",
                "anathema",
                "annex",
                "antediluvian",
                "antipathy",
                "antiseptic",
                "antithesis",
                "apathetic",
                "apocryphal",
                "approbation",
                "arbitrary",
                "arboreal",
                "arcane",
                "archetypal",
                "arrogate",
                "ascetic",
                "aspersion",
                "assiduous",
                "atrophy",
                "bane",
                "bashful",
                "beguile",
                "bereft",
                "bilk",
                "blandishment",
                "bombastic",
                "boon",
                "brusque",
                "burnish",
                "buttress",
                "cajole",
                "callous",
                "calumny",
                "camaraderie",
                "candor",
                "capitulate",
                "capricious",
                "carouse",
                "carp",
                "caucus",
                "cavort",
                "circumlocution",
                "circumscribe",
                "circumvent",
                "clamor",
                "cleave",
                "clemency",
                "cobbler",
                "cogent",
                "cognizant",
                "commensurate",
                "complement",
                "compunction",
                "concomitant",
                "conduit",
                "conflagration",
                "congruity",
                "connive",
                "consign",
                "constituent",
                "construe",
                "contentious",
                "contravene",
                "contrite",
                "contusion",
                "conundrum",
                "convivial",
                "corpulence",
                "covet",
                "credulity",
                "cupidity",
                "cursory",
                "dearth",
                "debacle",
                "debauch",
                "debunk",
                "decry",
                "defile",
                "defunct",
                "deleterious",
                "demagogue",
                "demure",
                "denigrate",
                "deprecate",
                "deride",
                "derivative",
                "desecrate",
                "despot",
                "diaphanous",
                "didactic",
                "dirge",
                "disaffected",
                "discomfit",
                "discursive",
                "disparate",
                "dispel",
                "disrepute",
                "dissemble",
                "divisive",
                "dogmatic",
                "dour",
                "duplicity",
                "duress",
                "ebullient",
                "eclectic",
                "edict",
                "effrontery",
                "egregious",
                "elegy",
                "elicit",
                "embezzlement",
                "emend",
                "emollient",
                "empirical",
                "emulate",
                "enervate",
                "enfranchise",
                "engender",
                "ephemeral",
                "epistolary",
                "equanimity",
                "equivocal",
                "eschew",
                "espouse",
                "evanescent",
                "evince",
                "exacerbate",
                "exculpate",
                "execrable",
                "exhort",
                "exigent",
                "expedient",
                "expiate",
                "expunge",
                "expurgate",
                "extant",
                "extol",
                "extraneous",
                "fallacious",
                "fastidious",
                "fatuous",
                "feral",
                "fetid",
                "fetter",
                "flagrant",
                "florid",
                "foil",
                "forbearance",
                "fortuitous",
                "fractious",
                "garrulous",
                "gourmand",
                "grandiloquent",
                "gratuitous",
                "gregarious",
                "hackneyed",
                "hapless",
                "harangue",
                "hegemony",
                "heterogenous",
                "iconoclast",
                "idiosyncratic",
                "impassive",
                "impecunious",
                "imperious",
                "impertinent",
                "impervious",
                "impetuous",
                "impinge",
                "implacable",
                "impute",
                "inane",
                "inchoate",
                "incontrovertible",
                "incumbent",
                "indefatigable",
                "ineffable",
                "inexorable",
                "ingenuous",
                "inimical",
                "iniquity",
                "injunction",
                "inoculate",
                "insidious",
                "instigate",
                "insurgent",
                "interlocutor",
                "intimation",
                "intransigent",
                "inure",
                "invective",
                "inveterate",
                "irreverence",
                "jubilant",
                "juxtaposition",
                "knell",
                "laconic",
                "languid",
                "largess",
                "largesse",
                "latent",
                "legerdemain",
                "libertarian",
                "licentious",
                "limpid",
                "linchpin",
                "litigant",
                "maelstrom",
                "magnanimous",
                "malediction",
                "malevolent",
                "manifold",
                "maudlin",
                "maverick",
                "mawkish",
                "maxim",
                "mendacious",
                "mercurial",
                "modicum",
                "morass",
                "mores",
                "multifarious",
                "munificent",
                "myriad",
                "nadir",
                "nascent",
                "nefarious",
                "negligent",
                "neophyte",
                "noisome",
                "noxious",
                "obdurate",
                "obfuscate",
                "oblique",
                "obsequious",
                "obstreperous",
                "obtuse",
                "odious",
                "officious",
                "onerous",
                "ostensible",
                "ostracism",
                "palliate",
                "pallid",
                "panacea",
                "paradigm",
                "paragon",
                "pariah",
                "parsimony",
                "partisan",
                "pathos",
                "paucity",
                "pejorative",
                "pellucid",
                "penchant",
                "penurious",
                "perfidious",
                "perfunctory",
                "pernicious",
                "pert",
                "pertinacious",
                "philanthropic",
                "phlegmatic",
                "pithy",
                "platitude",
                "plaudit",
                "plenitude",
                "plethora",
                "portent",
                "potentate",
                "preclude",
                "precocious",
                "predilection",
                "preponderance",
                "presage",
                "primeval",
                "probity",
                "proclivity",
                "profligate",
                "promulgate",
                "propensity",
                "propitious",
                "prosaic",
                "proscribe",
                "protean",
                "prurient",
                "puerile",
                "pugnacious",
                "pulchritude",
                "punctilious",
                "quagmire",
                "quaint",
                "quandary",
                "querulous",
                "quixotic",
                "rancor",
                "rebuke",
                "recalcitrant",
                "rectitude",
                "redoubtable",
                "relegate",
                "remiss",
                "replete",
                "reprieve",
                "reprobate",
                "reprove",
                "repudiate",
                "requisition",
                "rescind",
                "restive",
                "ribald",
                "rife",
                "ruse",
                "sacrosanct",
                "sagacity",
                "salient",
                "sanctimonious",
                "sanguine",
                "scurrilous",
                "semaphore",
                "serendipity",
                "servile",
                "sobriety",
                "solicitous",
                "solipsism",
                "somnolent",
                "spurious",
                "staid",
                "stolid",
                "stupefy",
                "subjugate",
                "surfeit",
                "surmise",
                "surreptitious",
                "swarthy",
                "sycophant",
                "tacit",
                "taciturn",
                "tangential",
                "tantamount",
                "temerity",
                "tenuous",
                "timorous",
                "tirade",
                "toady",
                "tome",
                "torpid",
                "tractable",
                "transient",
                "transmute",
                "travesty",
                "trenchant",
                "trite",
                "truculent",
                "turgid",
                "turpitude",
                "ubiquitous",
                "umbrage",
                "unctuous",
                "upbraid",
                "usurp",
                "utilitarian",
                "vacillate",
                "vacuous",
                "vapid",
                "variegated",
                "venerate",
                "veracity",
                "verdant",
                "vestige",
                "vex",
                "vicarious",
                "vicissitude",
                "vilify",
                "virtuoso",
                "viscous",
                "vitriolic",
                "vituperate",
                "vociferous",
                "wanton",
                "wily",
                "winsome",
                "wistful",
                "yoke",
                "zenith",
                "zephyr"};
    }
}

