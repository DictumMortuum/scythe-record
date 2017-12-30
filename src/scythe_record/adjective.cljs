(ns scythe-record.adjective)

(def adjectives
  [ "able"
    "above"
    "abreast"
    "abrupt"
    "absent"
    "abstracted"
    "absurd"
    "accessible"
    "accident"
    "accomplished"
    "accurate"
    "acid"
    "acidic"
    "acid-washed"
    "acoustic"
    "acrimonious"
    "acrobatic"
    "acting"
    "active"
    "actual"
    "additional"
    "adenoidal"
    "adept"
    "adjective"
    "admirable"
    "advanced"
    "adventurous"
    "aesthetic"
    "affable"
    "afflicted"
    "afraid"
    "after-hours"
    "age-old"
    "aggravated"
    "aggressive"
    "agile"
    "air-tight"
    "akin"
    "album-ending"
    "alien"
    "alive"
    "allergic"
    "all-inclusive"
    "all-out"
    "all-purpose"
    "alternative"
    "amateurish"
    "ambiguous"
    "ambitious"
    "amused"
    "anarchic"
    "ancient"
    "anemic"
    "angelic"
    "angry"
    "angular"
    "animal"
    "animalistic"
    "annoyed"
    "anonymous"
    "antagonistic"
    "anticlimactic"
    "anxious"
    "anywhere"
    "apathetic"
    "apocalyptic"
    "apparent"
    "applicable"
    "appreciate"
    "approachable"
    "appropriate"
    "apt"
    "aptly-named"
    "arbitrary"
    "archetypal"
    "architectural"
    "arduous"
    "arena-rattling"
    "arguable"
    "arid"
    "artful"
    "art-horror"
    "artificial"
    "artistic"
    "ascendant"
    "assertive"
    "ass-kicking"
    "astute"
    "atavistic"
    "at-risk"
    "attention-grab"
    "attractive"
    "audacious"
    "audible"
    "aural"
    "austere"
    "authoritative"
    "autobiographical"
    "available"
    "avant-garde"
    "avowed"
    "awake"
    "aware"
    "awe-inspiring"
    "awful"
    "awhile"
    "awkward"
    "bad"
    "banal"
    "bandcamp-released"
    "bankable"
    "barbaric"
    "barbed"
    "bare"
    "bargain-basement"
    "barren"
    "bashful"
    "basic"
    "bassbin-quaking"
    "beatific"
    "beat-oriented"
    "beautiful"
    "been-hurt-before"
    "beholden"
    "believable"
    "beloved"
    "bent"
    "best"
    "bestial"
    "best-known"
    "better"
    "biblical"
    "big"
    "bigger"
    "bitchy"
    "bitter"
    "bittersweet"
    "bizarre"
    "black"
    "blah"
    "blank"
    "blasphemous"
    "blatant"
    "bleak"
    "bleary"
    "blind"
    "blissful"
    "blue"
    "blue-black"
    "blue-collar"
    "blurry"
    "boisterous"
    "bold"
    "bombastic"
    "bong-rip"
    "bored"
    "bouncy"
    "brand-new"
    "brave"
    "breathtaking"
    "breezy"
    "brief"
    "bright"
    "bright-seamed"
    "brilliant"
    "brisk"
    "british"
    "brittle"
    "broad"
    "brusque"
    "brutal"
    "b-tinged"
    "bug-eyed"
    "built-in"
    "bullish"
    "buoyant"
    "burly"
    "busy"
    "bygone"
    "cagey"
    "callous"
    "callow"
    "calm"
    "candid"
    "capable"
    "careful"
    "carnal"
    "casual"
    "catchy"
    "cathartic"
    "caustic"
    "cautionary"
    "cautious"
    "cavernous"
    "celebratory"
    "cellular"
    "central"
    "cerebral"
    "ceremonial"
    "certain"
    "chance/"
    "chaotic"
    "characteristic"
    "charged"
    "charismatic"
    "cheeky"
    "cheerful"
    "cheery"
    "cherished"
    "chicago’s"
    "chin-scratching"
    "chipper"
    "choppy"
    "christian"
    "chromatic"
    "chunky"
    "cinderblock-smashing"
    "cinematic"
    "circular"
    "civil"
    "clangorous"
    "classic"
    "classical"
    "clean"
    "clear"
    "clear-eyed"
    "cleverly-used"
    "click-track"
    "climactic"
    "clinical"
    "close"
    "closing"
    "clumsy"
    "clunky"
    "co-ed"
    "cognitive"
    "coherent"
    "cold"
    "collaborative"
    "collective"
    "color"
    "colorful"
    "colourful"
    "combustible"
    "comfortable"
    "comfy"
    "comic"
    "commercial"
    "common"
    "communal"
    "community’s"
    "comparable"
    "compatible"
    "compelling"
    "competent"
    "competitive"
    "complacent"
    "complementary"
    "complete"
    "complex"
    "complicated"
    "compositional"
    "comprehensive"
    "compulsive"
    "conceptual"
    "concrete"
    "conducive"
    "confident"
    "confrontational"
    "confused"
    "conscious"
    "conservative"
    "considerable"
    "consistent"
    "conspicuous"
    "conspiratorial"
    "constant"
    "contemplative"
    "content"
    "contentious"
    "contextual"
    "continuous"
    "controversy-stoking"
    "convenient"
    "conventional"
    "conversational"
    "convinced-of-its-own-sanity"
    "cool"
    "corporate-funded"
    "correct"
    "corrective"
    "corroded"
    "corrosive"
    "cosmic"
    "counry-tinged"
    "counterintuitive"
    "countrified"
    "coy"
    "cracked"
    "cramped"
    "cranky"
    "crappy"
    "crazy"
    "creative"
    "credible"
    "critical"
    "crowded"
    "crowd-pleasing"
    "crucial"
    "crude"
    "crushed"
    "cryptic"
    "cultural"
    "cumulative"
    "curious"
    "current"
    "cute"
    "cutting-edge"
    "cyclic"
    "cyclical"
    "cynical"
    "daily"
    "danceable"
    "dance-indebted"
    "dangerous"
    "dark"
    "darkly"
    "day-to-day"
    "dazed"
    "dead"
    "dead-end"
    "deadpan"
    "dear"
    "decent"
    "deep-rooted"
    "deep-seated"
    "deferential"
    "defiant"
    "definite"
    "definitive"
    "deflective"
    "delayed"
    "deliberate"
    "delicate"
    "delirious"
    "deluxe"
    "demented"
    "democratic"
    "demon/"
    "dependable"
    "depressed"
    "deranged"
    "derivative"
    "descriptive"
    "deserve"
    "desolate"
    "desperate"
    "despondent"
    "desultory"
    "detached"
    "detail-intensive"
    "detectable"
    "detective"
    "determined"
    "devastating"
    "deviant"
    "devious"
    "dexterous"
    "diaphanous"
    "different"
    "difficult"
    "diffident"
    "digestible"
    "dignified"
    "direct"
    "directive"
    "dirty"
    "disaffected"
    "disappointed"
    "disappointing"
    "disastrous"
    "discernable"
    "discontent"
    "discordant"
    "discrete"
    "disembodied"
    "dishonest"
    "disparate"
    "disposable"
    "distant"
    "distinct"
    "distinctive"
    "distorted"
    "distressed"
    "disturbing"
    "ditzy"
    "divergent"
    "diverse"
    "doe-eyed"
    "doleful"
    "dolorous"
    "dominant"
    "don’t"
    "dorky"
    "double"
    "double-edged"
    "downcast"
    "downer-ridden"
    "drained"
    "dramatic"
    "drastic"
    "dream-like"
    "dream-pop"
    "dreary"
    "drove"
    "drummer/vocalist"
    "drunk"
    "dry"
    "dual"
    "due"
    "dull"
    "duo’s"
    "dusky"
    "dylan/band"
    "dylan’s"
    "dynamic"
    "dystopian"
    "eager"
    "earlier"
    "earliest"
    "early"
    "early-morning"
    "earned"
    "earnest"
    "earthy"
    "east"
    "easy"
    "ebullient"
    "eccentric"
    "ecstasy"
    "ecstatic"
    "ecumenical"
    "edm-ward"
    "effective"
    "effortless"
    "effusive"
    "elaborate"
    "elastic"
    "electric"
    "electro-gallop"
    "electronic"
    "elegant"
    "elemental"
    "elementary"
    "elevated"
    "elliptical"
    "eloquent"
    "elusive"
    "embarrassed"
    "embarrassing"
    "emblematic"
    "emotional"
    "emotive"
    "empathetic"
    "empathy"
    "emphatic"
    "empty"
    "endless"
    "energetic"
    "engaged"
    "engaging"
    "english"
    "enjoyable"
    "ennui-ridden"
    "enormous"
    "enough"
    "enraged"
    "enthralled"
    "enthusiastic"
    "entire"
    "entrepreneurial"
    "enviable"
    "envious"
    "ephemeral"
    "epic"
    "epochal"
    "equal"
    "erratic"
    "erstwhile"
    "erudite"
    "essential"
    "established"
    "eternal"
    "ethereal"
    "euphemistic"
    "euphoric"
    "european"
    "eventual"
    "ever-changing"
    "ever-rotating"
    "evident"
    "evocative"
    "exact"
    "exanimate"
    "excellent"
    "exceptional"
    "excited"
    "exciting"
    "exclusive"
    "exemplary"
    "ex-fiery"
    "exhausted"
    "exhaustive"
    "existential"
    "exotic"
    "expansive"
    "experiential"
    "experimental"
    "explicit"
    "exploratory"
    "explosive"
    "exquisite"
    "extemporaneous"
    "extended"
    "extensive"
    "external"
    "extra"
    "extraordinary"
    "extravagant"
    "extreme"
    "exuberant"
    "faint"
    "fair"
    "faithful"
    "familiar"
    "famous"
    "fantastic"
    "fantastical"
    "far"
    "far-flung"
    "far-ranging"
    "fashionable"
    "fast"
    "fat"
    "fatal"
    "fatuous"
    "favorite"
    "fellow"
    "female"
    "feral"
    "ferocious"
    "fertile"
    "feverish"
    "few"
    "fewer"
    "fictional"
    "fiendish"
    "figurative"
    "filthy"
    "final"
    "final-boss"
    "financial"
    "first"
    "first-ever"
    "fit"
    "fitful"
    "flagrant"
    "flashy"
    "flat"
    "fleeting"
    "flexible"
    "flirty"
    "flowery"
    "fly-by-night"
    "focal"
    "folk-based"
    "folksy"
    "foolish"
    "forced"
    "foreboding"
    "foreign"
    "forgettable"
    "formal"
    "formative"
    "former"
    "formidable"
    "formulaic"
    "forth"
    "forward-looking"
    "foul"
    "fourth"
    "fractious"
    "fragile"
    "frantic"
    "fraught"
    "freakish"
    "free"
    "freeze-dried"
    "frenetic"
    "frenzied"
    "frequent"
    "fresh"
    "frigid"
    "frivolous"
    "front"
    "frostbitten"
    "frown"
    "fruitful"
    "frustrated"
    "fucked-up"
    "full"
    "full-blown"
    "full-bodied"
    "full-length"
    "full-scale"
    "fumbling-teenagers-in-lust"
    "funereal"
    "funky"
    "funny"
    "funny/sad"
    "furious"
    "further"
    "furthest"
    "furtive"
    "fussy"
    "futile"
    "future"
    "fuzzy"
    "gala-happy"
    "garrulous"
    "gastric"
    "geeky"
    "general"
    "generalized"
    "generational"
    "generous"
    "genial"
    "gentle"
    "gentle-but-firm"
    "gettable"
    "ghoulish"
    "giant"
    "giddy"
    "gigantic"
    "giggly"
    "gleeful"
    "glib"
    "global"
    "gloom-rock"
    "gloomy"
    "glorious"
    "gnarled"
    "golden"
    "good"
    "good-natured"
    "goofy"
    "googly-eyed"
    "gore"
    "gorgeous"
    "gothic"
    "graceful"
    "gracious"
    "gradual"
    "grand"
    "graphic"
    "grateful"
    "grave"
    "greasy"
    "great"
    "greater"
    "greatest"
    "green"
    "grim"
    "grim-faced"
    "grimy"
    "groggy"
    "groovy"
    "grotesque"
    "grumpy"
    "guided"
    "guilty"
    "gutsy"
    "guttural"
    "hair-raising"
    "half-baked"
    "half-forgotten"
    "half-hearted"
    "half-step"
    "half-time"
    "hallucinogenic"
    "hands-down"
    "happy"
    "happy-hardcore"
    "hard"
    "hardcore"
    "hardcore-punk"
    "hard-driving"
    "hard-fought"
    "hard-pressed"
    "harmonic"
    "harmonious"
    "harmonized"
    "harsh"
    "hateful"
    "haunted-house"
    "hazy"
    "headlong"
    "healthy"
    "hear"
    "heard"
    "hear-the-keys-being-pressed"
    "heavy"
    "hedonistic"
    "hefty"
    "hellish"
    "heroic"
    "hideous"
    "hi-fi"
    "high"
    "higher"
    "high-pitched"
    "high-speed"
    "high-spirited"
    "high-strung"
    "hi-hat"
    "hilarious"
    "historical"
    "histrionic"
    "hollow"
    "homogeneous"
    "honest"
    "honest-to-god"
    "hopeful"
    "horny"
    "hot"
    "hot-stove"
    "hour-long"
    "house-tinged"
    "huge"
    "human"
    "humane"
    "humble"
    "humid"
    "hungry"
    "hurried"
    "hushed"
    "hyper"
    "hyperactive"
    "hypocritical"
    "idealistic"
    "idealized"
    "identifiable"
    "ideological"
    "idiosyncratic"
    "id-startled"
    "ill-advised"
    "illegal"
    "illustrious"
    "imaginable"
    "imaginative"
    "imitative"
    "immediate"
    "imminent"
    "imperceptible"
    "imperious"
    "impervious"
    "impiety’s"
    "implacable"
    "implicit"
    "important"
    "impossible"
    "impressed"
    "impressionistic"
    "impressive"
    "improbable"
    "impulsive"
    "inadequate"
    "incapable"
    "incessant"
    "incisive"
    "incompatible"
    "incomplete"
    "incongruous"
    "incredible"
    "incremental"
    "indefinable"
    "indefinite"
    "indelible"
    "independent"
    "indescribable"
    "indicative"
    "indifferent"
    "indispensable"
    "indistinguishable"
    "individual"
    "indulgent"
    "industrial"
    "ineffectual"
    "inessential"
    "inevitable"
    "inexorable"
    "inexplicable"
    "infectious"
    "infinite"
    "influential"
    "infuriated"
    "ingenuous"
    "inherent"
    "initial"
    "innate"
    "inner"
    "innovative"
    "inquisitive"
    "insatiable"
    "inscrutable"
    "inside"
    "insipid"
    "inspiration-wise"
    "instant"
    "instinctive"
    "integral"
    "intellectual"
    "intelligent"
    "intense"
    "intentional"
    "interested"
    "interesting"
    "interim"
    "internal"
    "international"
    "interstellar"
    "intimate"
    "intimidated"
    "intolerable"
    "intrepid"
    "intricate"
    "intriguing"
    "intrinsic"
    "intuitive"
    "inventive"
    "invigorated"
    "invincible"
    "inward"
    "irascible"
    "irate"
    "ironic"
    "irregular"
    "irresistible"
    "irritated"
    "isolated"
    "italian"
    "itchy"
    "jam-packed"
    "jazzy"
    "jealous"
    "jest/"
    "jews-loving"
    "joyous"
    "jubilant"
    "just-released"
    "juvenile"
    "kaleidoscopic"
    "keen"
    "key"
    "kid"
    "kid-in-a-candy-store"
    "kind"
    "kinetic"
    "kitty"
    "laconic"
    "laid"
    "large"
    "larger"
    "larger-than-life"
    "last"
    "lasting"
    "late"
    "later"
    "latest"
    "latter-day"
    "laudable"
    "laugh"
    "lazy"
    "leaden"
    "leafblower-growl"
    "lean"
    "learned"
    "least"
    "lecherous"
    "legal"
    "legendary"
    "legitimate"
    "lengthy"
    "lesbian"
    "less"
    "less-outlandish"
    "lethal"
    "lethargic"
    "liable"
    "lifelong"
    "life-or-death"
    "light"
    "light-hearted"
    "likable"
    "like"
    "likely"
    "like-minded"
    "limited"
    "limp-wristed"
    "linguistic"
    "listener’s"
    "listless"
    "literal"
    "literary"
    "little"
    "live"
    "lively"
    "load-bearing"
    "local"
    "localized"
    "lofty"
    "logical"
    "lonely"
    "long"
    "long-distance"
    "long-forgotten"
    "long-playing"
    "long-since-formed"
    "long-suffering"
    "long-time"
    "long-winded"
    "loose"
    "loud"
    "lousy"
    "loutish"
    "lovable"
    "loved"
    "lovely"
    "low"
    "low-key"
    "low-level"
    "loyal"
    "lucid"
    "lucky"
    "ludicrous"
    "lugubrious"
    "luminous"
    "lurid"
    "lush"
    "lust"
    "luxurious"
    "lyric"
    "lyrical"
    "mad"
    "magical"
    "magnetic"
    "magnificent"
    "main"
    "majestic"
    "major"
    "male"
    "malevolent"
    "malleable"
    "manageable"
    "manager’s"
    "man-eater"
    "manic"
    "many"
    "married"
    "martial"
    "marxist-leninist"
    "massive"
    "masterful"
    "maternal"
    "mawkish"
    "maximal"
    "mean"
    "meaningful"
    "meat-locker"
    "mechanical"
    "mechanistic"
    "mechanized"
    "medical"
    "melancholic"
    "melancholy"
    "mellow"
    "melodic"
    "melodious"
    "melodramatic"
    "memorable"
    "mental"
    "mercurial"
    "mere"
    "messy"
    "metal"
    "metallic"
    "metallic-tinged"
    "metaphysical"
    "meter-driving"
    "methodical"
    "meticulous"
    "mid"
    "middle"
    "middle-aged"
    "might’ve"
    "military"
    "millennial"
    "milton’s"
    "mimic"
    "minimal"
    "minimalist"
    "minimum"
    "minor"
    "misanthropic"
    "mischievous"
    "misguided"
    "misty-forest"
    "mocking"
    "moderate"
    "modern"
    "modest"
    "modular"
    "modulated"
    "molecular"
    "momentary"
    "moment’s"
    "monochromatic"
    "monolithic"
    "monomaniacal"
    "monotonous"
    "monstrous"
    "moody"
    "moony-eyed"
    "moral"
    "morbid"
    "more"
    "moronic"
    "morose"
    "mortal"
    "most"
    "motivational"
    "mottled"
    "mournful"
    "much"
    "muffled"
    "multiple"
    "mundane"
    "murderous"
    "murky"
    "muscular"
    "musical"
    "muster"
    "mutant"
    "mutual"
    "mysterious"
    "mystic"
    "mystical"
    "mythic"
    "mythical"
    "mythological"
    "nail-biting"
    "narcotic"
    "narcotized"
    "narrative"
    "nary"
    "nasty"
    "national"
    "native"
    "natural"
    "naturalistic"
    "naughty"
    "nauseated"
    "near"
    "near-silence"
    "near-zero"
    "neat"
    "nebulous"
    "necessary"
    "negative"
    "nerdy"
    "nerve-rattling"
    "nervous"
    "nervy"
    "net"
    "new"
    "next"
    "nice"
    "niche-satisfying"
    "nihilistic"
    "nimble"
    "noble"
    "nod’s"
    "noisy"
    "nomadic"
    "nonchalant"
    "noncommittal"
    "nonfigurative"
    "nonsensical"
    "nontraditional"
    "normal"
    "northern"
    "nostalgic"
    "notable"
    "noteworthy"
    "noticeable"
    "nova-tinged"
    "nuclear"
    "numb"
    "numerous"
    "nuptial"
    "oblique"
    "oblivious"
    "obnoxious"
    "observant"
    "observational"
    "obsessive"
    "obvious"
    "occasional"
    "odd"
    "odd-angled"
    "offensive"
    "official"
    "off-putting"
    "off-the-cuff"
    "off-the-wall"
    "oft-lugubrious"
    "okay"
    "old"
    "older"
    "old-fashioned"
    "ominous"
    "once-faraway"
    "once-lost"
    "once-vanguard"
    "one-man"
    "one-time"
    "ongoing"
    "only"
    "open-ended"
    "open-hearted"
    "open-minded"
    "operatic"
    "opposite"
    "oppressive"
    "optimistic"
    "opulent"
    "oracular"
    "ordinary"
    "organized"
    "original"
    "ornate"
    "ostentatious"
    "other"
    "outlandish"
    "outright"
    "outside"
    "outstanding"
    "out-weird"
    "overall"
    "overcast"
    "overdue"
    "overnight"
    "overpower"
    "oversized"
    "over-the-top"
    "own"
    "oxidized"
    "packed"
    "padded"
    "pained"
    "painful"
    "palliative"
    "pallid"
    "palpable"
    "panoramic"
    "paradoxical"
    "paranoid"
    "parental"
    "parisian"
    "partial"
    "particular"
    "passionate"
    "passive"
    "past"
    "pathetic"
    "pavlovian"
    "peaceful"
    "peak-hour"
    "peculiar"
    "pedestrian"
    "pejorative"
    "pensive"
    "pent-up"
    "peppy"
    "perceptible"
    "perennial"
    "perfect"
    "perfectly-suited"
    "perilous"
    "peripatetic"
    "perish"
    "perky"
    "perpetual"
    "persistent"
    "personal"
    "perspective"
    "persuasive"
    "pervasive"
    "perverse"
    "pessimistic"
    "phantasmagoric"
    "phantasmagorical"
    "philosophical"
    "phonetic"
    "physical"
    "pierced"
    "pink-skies"
    "pissed off"
    "pitch-black"
    "pitched"
    "pithy"
    "placid"
    "plainspoken"
    "plaintive"
    "platonic"
    "playful"
    "pleasant"
    "pleased"
    "pleasurable"
    "pliable"
    "plucky"
    "pocket-sized"
    "poetic"
    "poetry"
    "po-faced"
    "poignant"
    "pointed"
    "polemic"
    "polish"
    "polished"
    "polite"
    "political"
    "politics-of-sport-fucking"
    "ponderous"
    "poor"
    "pop"
    "popular"
    "portal"
    "portentous"
    "positive"
    "possible"
    "post-don’t"
    "postmodern"
    "post-punk"
    "post-punk/early"
    "post-reunion"
    "potent"
    "potential"
    "pound-the-alarm"
    "powerful"
    "pragmatic"
    "preachy"
    "precarious"
    "precious"
    "precise"
    "precocious"
    "predatory"
    "predictable"
    "preferable"
    "pregnant"
    "prehistoric"
    "preposterous"
    "prescient"
    "present"
    "present-day"
    "presumptive"
    "pretentious"
    "preternatural"
    "previous"
    "prideful"
    "primal"
    "primary"
    "prime"
    "primitive"
    "prior"
    "private"
    "private-press"
    "privy"
    "prodigious"
    "productive"
    "professional"
    "proficient"
    "profound"
    "progressive"
    "prolific"
    "prominent"
    "promising"
    "promotional"
    "pro-peace"
    "prophetic"
    "proportional"
    "prosaic"
    "protest"
    "prototypical"
    "protracted"
    "proud"
    "proven"
    "proverbial"
    "provisional"
    "psychedelic"
    "psychiatric"
    "psychic"
    "public"
    "puerile"
    "punctuate"
    "pure"
    "puritanical"
    "purposeful"
    "putrid"
    "queasy"
    "queen-sized"
    "queer-friendly"
    "questionable"
    "quick"
    "quiet"
    "quintessential"
    "quirky"
    "quixotic"
    "quotable"
    "rabblerouser-slash-raconteur"
    "radiant"
    "radical"
    "rambunctious"
    "rampant"
    "randomized"
    "raps.getting"
    "rapture-style"
    "rapturous"
    "rare"
    "raucous"
    "raw"
    "razor-sharp"
    "reactionary"
    "ready"
    "real"
    "realistic"
    "realized"
    "reasonable"
    "recalcitrant"
    "recent"
    "recognizable"
    "reconstitute"
    "recorded"
    "recumbent"
    "red"
    "redundant"
    "reference-heavy"
    "refined"
    "reflective"
    "reflexive"
    "refreshed"
    "regal"
    "regular"
    "rejected"
    "rejuvenated"
    "related"
    "relative"
    "relaxed"
    "relevant"
    "reliable"
    "relieved"
    "remarkable"
    "remember"
    "reminiscent"
    "renewal"
    "repetitive"
    "replete"
    "representative"
    "requisite"
    "re-released"
    "re-signed"
    "resigned-sounding"
    "resolute"
    "resonant"
    "respectable"
    "respective"
    "responsible"
    "restless"
    "restraint"
    "retrospective"
    "revelatory"
    "reverential"
    "revolutionary"
    "rhythmic"
    "rhythm-obsessed"
    "rich"
    "ridiculous"
    "riff-happy"
    "righteous"
    "rightful"
    "rigid"
    "rigorous"
    "risk-averse"
    "risky"
    "ritual"
    "robotic"
    "rocky"
    "rogue"
    "romantic"
    "rough"
    "rough-cut"
    "rousing"
    "ruminative"
    "run-up"
    "rural"
    "rush"
    "rushed"
    "rustic"
    "sad"
    "safe"
    "same"
    "sarcastic"
    "sardonic"
    "sartorial"
    "sassy"
    "satellite"
    "satirical"
    "satisfied"
    "sawed-off"
    "sawn-off"
    "scant"
    "scared"
    "scary"
    "scene-focused"
    "schizophrenic"
    "schmaltzy"
    "scientific"
    "sci-fi-obsessed"
    "scorched"
    "seamless"
    "seasoned"
    "second"
    "second-best"
    "second-class"
    "second-rate"
    "sedate"
    "seductive"
    "self-assured"
    "self-aware"
    "self-awareness"
    "self-conscious"
    "self-contained"
    "self-deprecating"
    "self-explanatory"
    "self-important"
    "selfish"
    "self-pitying"
    "self-released"
    "self-satisfied"
    "sensible"
    "sensitive"
    "sensual"
    "sensuous"
    "seo-enhanced"
    "separate"
    "sequential"
    "serious"
    "serviceable"
    "several"
    "sex-positive"
    "sexual"
    "sexy"
    "shaky"
    "sharp"
    "shit-talking"
    "shitty"
    "shocked"
    "shock-tactic"
    "short"
    "short-lived"
    "short-run"
    "shout-along"
    "shout-chorus"
    "shy"
    "sick"
    "sickly"
    "signal"
    "significant"
    "silken"
    "silky"
    "silly"
    "similar"
    "simple"
    "simplistic"
    "simulated"
    "simultaneous"
    "singer"
    "singer/guitarist"
    "singer’s"
    "singer-songwriter"
    "singer/songwriter"
    "single"
    "singsong"
    "singular"
    "sinister"
    "sizable"
    "sizeable"
    "sizzling"
    "skeptical"
    "skilled"
    "skinny"
    "skit-like"
    "slack"
    "slavish"
    "sleepy"
    "slight"
    "slightest"
    "slim"
    "slippery"
    "sloppy"
    "slow"
    "slow-burning"
    "slower"
    "sluggish"
    "small"
    "smaller"
    "small-scale"
    "smiley-faced"
    "smiths-indebted"
    "smoky"
    "snappy"
    "sneaky"
    "social"
    "societal"
    "soft"
    "sole"
    "solemn"
    "solid"
    "solidified"
    "solitary"
    "solo-happy"
    "somber"
    "sophisticated"
    "sophomore"
    "soporific"
    "sordid"
    "sore"
    "sorry"
    "sought-after"
    "soulful"
    "sound"
    "spacious"
    "spastic"
    "special"
    "specific"
    "spectacular"
    "spectral"
    "speedy"
    "spiral"
    "splintery"
    "split"
    "spontaneous"
    "spooky"
    "sporadic"
    "sprawling"
    "sprightly"
    "stable"
    "staggering"
    "stand-alone"
    "standard"
    "stark"
    "starry-eyed"
    "startling"
    "steady"
    "steely-eyed"
    "steeple-shaking"
    "stellar"
    "sticky"
    "stiff"
    "still-fascinating"
    "stirring"
    "stoic"
    "stone-faced"
    "straight"
    "straightforward"
    "strange"
    "streamlined"
    "stream-of-consciousness"
    "stressed"
    "stressful"
    "stretched"
    "striking"
    "stripped"
    "stripped-down"
    "striptease-ready"
    "strong"
    "structural"
    "studied"
    "studious"
    "stupid"
    "stylish"
    "stylistic"
    "stylized"
    "subaquatic"
    "subconscious"
    "subject"
    "subliminal"
    "submissive"
    "subsequent"
    "substantial"
    "subtle"
    "subversive"
    "successful"
    "such"
    "sudden"
    "sugary"
    "suggestive"
    "suitable"
    "sultry"
    "sumptuous"
    "sun-drenched"
    "sunken-eyed"
    "sunny"
    "sunny-named"
    "superficial"
    "supernatural"
    "supple"
    "supplementary"
    "sure"
    "surgical"
    "surprised"
    "surprising"
    "surrealistic"
    "surrounded"
    "sustainable"
    "sustain-drenched"
    "swagger"
    "sweeping"
    "sweet"
    "syllabic"
    "symbolic"
    "sympathetic"
    "symphonic"
    "symptomatic"
    "synonymous"
    "tactile"
    "tall"
    "tangible"
    "tangled"
    "tasteful"
    "tautological"
    "technical"
    "technological"
    "tedious"
    "tender"
    "tenfold"
    "tense"
    "tensile"
    "tentative"
    "terrible"
    "terrific"
    "testimonial"
    "thankful"
    "theatrical"
    "thematic"
    "theoretical"
    "therapeutic"
    "thesis-like"
    "thin"
    "thirsty"
    "thorough"
    "thoughtful"
    "threadbare"
    "three-dimensional"
    "thrown"
    "tight"
    "tight-knit"
    "time-honored"
    "timeless"
    "times-picayune"
    "tiny"
    "tired"
    "titular"
    "tonal"
    "tongue-in-cheek"
    "too-obvious"
    "top"
    "top-heavy"
    "topic"
    "topical"
    "top-notch"
    "torrential"
    "torrid"
    "total"
    "touched"
    "tough"
    "toxic"
    "traceable"
    "traditional"
    "tragic"
    "transcendental"
    "transitional"
    "tremendous"
    "tricky"
    "tried"
    "triple-kick"
    "trite"
    "triumphal"
    "triumphant"
    "troubled"
    "true"
    "trunk-rattling"
    "trusted"
    "tumultuous"
    "tuneful"
    "turn-of-the-century"
    "twisted"
    "two-step"
    "typical"
    "ubiquitous"
    "ultimate"
    "unable"
    "unadventurous"
    "unambitious"
    "unattainable"
    "unavoidable"
    "unbearable"
    "unbelievable"
    "unbridled"
    "uncanny"
    "uncharitable"
    "unclear"
    "uncomfortable"
    "unconditional"
    "understandable"
    "unequivocal"
    "uneven"
    "unexpected"
    "unfair"
    "unfamiliar"
    "unfettered"
    "unfit"
    "unflappable"
    "unfortunate"
    "unfulfilled"
    "unhinged"
    "unidentifiable"
    "unified"
    "unimaginable"
    "unintentional"
    "uninviting"
    "unique"
    "universal"
    "unknowable"
    "un-learn"
    "unlearned"
    "unlikely"
    "unmemorable"
    "unmistakable"
    "unnecessary"
    "unorthodox"
    "unpleasant"
    "unpredictable"
    "unremarkable"
    "unrepresentative"
    "unromantic"
    "unsentimental"
    "unshakeable"
    "unstoppable"
    "unthinkable"
    "untoward"
    "unusual"
    "unwanted"
    "unwilling"
    "up-and-coming"
    "upbeat"
    "uproarious"
    "upward"
    "used"
    "useful"
    "useless"
    "usual"
    "utile"
    "vague"
    "valiant"
    "valorous"
    "valuable"
    "vaporous"
    "variable"
    "variant"
    "varied"
    "various"
    "vast"
    "verbose"
    "vernacular"
    "versatile"
    "verse-chorus"
    "verse-chorus-verse"
    "vertiginous"
    "very"
    "viable"
    "vibrant"
    "vicious"
    "vigorous"
    "villainous"
    "violent"
    "virtual"
    "viscous"
    "visible"
    "visual"
    "vital"
    "vivid"
    "vocal"
    "void"
    "volatile"
    "voluminous"
    "vulnerable"
    "wacky"
    "wan"
    "wanted"
    "warped"
    "wary"
    "weary"
    "weathered"
    "weekly"
    "weird"
    "well-adjusted"
    "well-chosen"
    "well-intentioned"
    "well-meaning"
    "western"
    "whimsical"
    "white"
    "whole"
    "wide"
    "wide-eyed"
    "widespread"
    "wild"
    "wilder"
    "wild-eyed"
    "willful"
    "willing"
    "winged"
    "winning"
    "wispy"
    "wistful"
    "witty"
    "wonder"
    "wonderful"
    "wondrous"
    "wordless"
    "working"
    "world-shaking"
    "world-weary"
    "worried"
    "worse"
    "worst"
    "worth"
    "worthy"
    "would-be"
    "wrong"
    "young"
    "younger"
    "youthful"
    "zealous"])
