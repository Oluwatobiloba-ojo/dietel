package chibuzorarrayexcercise;


import java.util.Scanner;

import static java.lang.System.in;

public class MBTi {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        String [][] extroIntro = new String[4][5];
        int amountOfB = 0;
        int amountOfA = 0;
        String personalType = "";
        String [] personalA = {"E", "S", "T", "J"};
        String [] personalB = {"I", "N", "F", "P"};
        String [][] a = {{"expend energy, enjoy group", "think out loud","public activities","express yourself","active, initiate"},
                        {"Interpret literally","practical","standard, usual","focus on here and now","Fact things, what it is"},
                        {"logical, thinking","candid, straight forward, frank","Tough-minded, just","issue oriented","tend to criticize"},
                        {"Organized, orderly", "plan, schedule","regulated and structured","Preparation, plan ahead","control govern"},
                };
        String [][] b = {{"conserve energy, enjoy one on one","think to yourself","solitary activities","keep to yourself","reflective, deliberate"},
                {"look for meaning and possibilities", "imaginative","different, unique","look to the future, global perspective,Big Picture","dreams, what it could be"},
                        {"empathetic, feeling","tactful, kind,encouraging","tender-hearted, merciful","people oriented","tend to appreciate"},
                                {"flexible, adaptable", "unplanned, spontaneous","easy going, live and let live","go with the flow, adapt as you go","latitude, freedom"},
                      };
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        for (int row = 0; row < b.length ; row++) {
            for (int columns = 0; columns < b[row].length; columns++) {
                String answerB = b[row][columns];
                String answerA = a[row][columns];
                System.out.printf("""
                         A. %s                                      B. %s
                        """, answerA, answerB);
                String response = input.next();
                response = response.toUpperCase();
                while (!(response.equals("A") || response.equals("B"))) {
                    System.out.println("Expected A and B as a response: ");
                    System.out.println("I know this is an error please try again, you still have a chance ");
                    System.out.printf("""
                             A. %s                                      B. %s
                            """, answerA, answerB);
                    response = input.next();
                    response = response.toUpperCase();
                }
                if (response.equals("A")) {
                    extroIntro[row][columns] = "A." + answerA;
                } else {
                    extroIntro[row][columns] = "B." + answerB;
                }
            }
        }
        System.out.println("Hello " + name + " you selected ");
        for (int row = 0; row < extroIntro.length; row++) {
            for (int response = 0; response < extroIntro[row].length; response++) {
                String request = extroIntro[row][response];
                System.out.printf("""
                        %s
                        """, request);
                if (request.charAt(0) == 'A') {
                    amountOfA++;
                } else {
                    amountOfB++;
                }
            }
            if (amountOfA > amountOfB){
                personalType += personalA[row];
            } else if (amountOfB > amountOfA) {
                personalType += personalB[row];
            }
            System.out.println("Number of A selected is " + amountOfA);
            System.out.println("Number of B selected is " + amountOfB);
            System.out.println();
            amountOfB = 0;
            amountOfA = 0;
        }
        displayPersonalityTypes(personalType);
    }

    private static void displayPersonalityTypes(String personalType) {
        switch (personalType) {
            case "INTJ" -> System.out.printf("""
                    %s
                                            
                    The %s personality Types:
                                            
                    Architects question everything. Many personality types trust the status quo, relying on
                    conventional wisdom and other people’s expertise to guide their lives. But ever-skeptical
                    Architects prefer to make their own discoveries. In their quest to find better ways of
                    doing things, they aren’t afraid to break the rules or risk disapproval – in fact,
                    they rather enjoy it.But as anyone with this personality type would tell you, a new idea
                    isn’t worth anything unless it actually works. Architects want to be successful, not just
                    inventive. They bring a single-minded drive to their work, applying the full force of their
                    insight, logic, and willpower. And heaven help anyone who tries to slow them down by enforcing
                    pointless rules or offering poorly thought-out criticism.
                                            
                    STRENGTH
                    *Rational – Architects pride themselves on the power of their minds.
                    *Informed – Few personality types are as devoted as Architects to
                    developing rational, correct, and evidence-based opinions.
                    *Curious – Architects are open to new ideas – as long as those ideas
                    are rational and evidence-based, that is.
                                            
                    WEAKNESS
                    *Arrogant – Architects might be knowledgeable, but they’re not infallible.
                    *Overly Critical – These personalities tend to have a great deal of
                    self-control, particularly when it comes to thoughts and feelings.
                    *Socially Clueless – Architects’ relentless rationality can lead to
                    frustration in their social lives.
                                            
                    CONCLUSION
                    Armed with powerful intellects and strategic minds, Architect (INTJ)
                    personalities can outmaneuver obstacles that seem unbeatable to most.
                    But Architects’ strengths, when misunderstood, can turn into weaknesses –
                    and keep them from reaching their full potential.
                    """, personalType, personalType);
            case "INTP" -> System.out.printf("""
                    %s
                    LOGICIAN
                        
                    The %s Personality Types
                    Logicians often lose themselves in thought – which isn’t necessarily a
                    bad thing. People with this personality type hardly ever stop thinking.
                    From the moment they wake up, their minds buzz with ideas, questions,
                    and insights. At times, they may even find themselves conducting full
                    -fledged debates in their own heads.
                    From the outside, Logicians may seem to live in a never-ending daydream.
                    They have a reputation for being pensive, detached, and a bit reserved.
                    That is, until they try to train all of their mental energy on the moment
                    or the person at hand, which can be a bit uncomfortable for everyone. But
                    regardless of which mode they’re in, Logicians are Introverts and tend to
                    get tired out by extensive socializing. After a long day, they crave time
                    alone to consult their own thoughts.
                                            
                    STRENGTH
                    *Analytical – Logicians analyze everything that they come across, from
                    research data to the behavior of the people around them.
                    *Open-Minded – Logicians are driven by curiosity and an intense desire
                    to learn everything that they can.
                    *Curious – These personalities are always casting about for new pursuits,
                    hobbies, and areas of research.
                                            
                    WEAKNESS
                    *Disconnected – Logicians can get lost in their own train of thought, even
                    when they’re with other people.
                    *Dissatisfied – Logicians can’t help but imagine how things could be better
                    than they already are.
                    *Impatient – Logicians take pride in their knowledge and in sharing their ideas.
                                            
                    CONCLUSION
                    If you feel understood right now, it’s because you are. Years of research have
                    given us deep insights into the unique strengths and challenges of Logicians like
                    you. And that includes the darker aspects of your personality type: the mystery of
                    why other people just don’t seem to get you, the constant frustration at a world
                    that seems tedious and superficial, and the nagging fear that all of your grand
                    ideas might never amount to anything.
                    """, personalType, personalType);
            case "ENTJ" -> System.out.printf("""
                    %s
                                            
                    COMMANDER
                                            
                    The %s Personality Types:
                    Commanders are natural-born leaders. People with this personality type embody
                    the gifts of charisma and confidence, and project authority in a way that draws
                    crowds together behind a common goal.
                                            
                    If there’s anything Commanders love, it’s a good challenge, big or small, and
                    they firmly believe that given enough time and resources, they can achieve any
                    goal. This quality makes people with the Commander personality type brilliant
                    entrepreneurs, and their ability to think strategically and hold a long-term
                    focus while executing each step of their plans with determination and precision
                    makes them powerful business leaders.
                                            
                    STRENGTH
                    *Self-Confident – Commanders couldn’t do this if they were plagued by self-doubt
                    – they trust their abilities, make known their opinions, and believe in their
                    capacities as leaders
                    *Energetic – Rather than finding this process taxing Commanders are energized by it
                    *Strong-Willed – Nor do they give up when the going gets tough – Commander
                    personalities strive to achieve their goals,
                                            
                    WEAKNESS
                    *Impatient – Some people need more time to think than others, an intolerable delay
                    to quick-thinking Commanders.
                    *Stubborn and Dominant – Sometimes all this confidence and willpower can go too far,
                    and Commanders are all too capable of digging in their heels,
                    *Arrogant – Commander personalities respect quick thoughts and firm convictions, their
                    own qualities, and look down on those who don’t match up.
                                            
                    CONCLUSION
                    Armed with a powerful intellect and strategic thinking, Commanders can overcome or
                    outmaneuver obstacles that seem unbeatable to most. At the same time, their many quirks,
                    such as often unconstrained rationalism, lead to many misunderstandings.
                    """, personalType, personalType);
            case "ENTP" -> System.out.printf("""
                    %s
                                            
                    DEBATER
                                            
                    The %s Personality Types:
                    Quick-witted and audacious, Debaters aren’t afraid to disagree with the status quo.
                    In fact, they’re not afraid to disagree with pretty much anything or anyone. Few
                    things light up people with this personality type more than a bit of verbal sparring
                    – and if the conversation veers into controversial terrain, so much the better.
                                            
                    Debaters are known for their rebellious streak. For this personality type, no belief
                    is too sacred to be questioned, no idea is too fundamental to be scrutinized, and no
                    rule is too important to be broken, or at least thoroughly tested. Sometimes Debaters
                    even rebel against their own beliefs by arguing the opposing viewpoint – just to see how
                    the world looks from the other side.
                                            
                    STRENGTH
                    *Knowledgeable – Debaters rarely pass up a good opportunity to learn something new,
                    especially abstract concepts.
                    *Excellent Brainstorms – Nothing is quite as enjoyable to Debaters as analyzing
                    problems from every angle to find the best solutions.
                    *Charismatic – People with the Debater personality type have a way with words and
                    wit that others find intriguing.
                                            
                    WEAKNESS
                    *Very Argumentative – If there’s anything Debaters enjoy, it’s the mental exercise of
                    debating an idea, and nothing is sacred.
                    *Insensitive – Being so rational, Debaters often misjudge others feelings and push
                    their debates well past others’ tolerance levels.
                    *Dislike Practical Matters – Debaters are interested in what could be – malleable
                    concepts like ideas and plans that can be adapted and debated.
                                            
                    CONCLUSION
                    Armed with a powerful intellect and vivid imagination, Debaters can overcome or
                    outmaneuver obstacles that seem unbeatable to most. At the same time, their many quirks,
                    such as often unconstrained rationalism, lead to many misunderstandings.
                    """, personalType, personalType);
            case "INFJ" -> System.out.printf("""
                    %s
                                            
                    Advocate
                                            
                    The %s Personality Types:
                    Advocates (INFJs) may be the rarest personality type of all, but they certainly leave
                    their mark on the world. Idealistic and principled, they aren’t content to coast through
                    life – they want to stand up and make a difference. For Advocate personalities, success
                    does’t come from money or status but from seeking fulfillment, helping others, and being
                    a force for good in the world.
                    Perhaps because their personality type is so uncommon, Advocates tend to carry around
                    a sense – whether conscious or not – of being different from most people. With their rich
                    inner lives and their deep, abiding desire to find their life purpose, they don’t always
                    fit in with those around them. This isn’t to say that Advocates can’t enjoy social
                    acceptance or close relationships – only that they sometimes feel misunderstood or at
                    odds with the world.
                    Many Advocates feel that their life has a unique purpose – a mission that they were put
                    onto this earth to fulfill.
                                            
                    STRENGTH
                    *Creative – Advocates aren’t exactly like everyone else – and that’s a wonderful thing.
                    *Insightful – These personalities know all too well that appearances can be misleading.
                    *Principled – Advocates tend to have strong beliefs and values, particularly when it
                    comes to matters of ethics.
                                            
                    WEAKNESS
                    *Reluctant to Open Up – Advocates value honesty and authenticity, but they’re also private.
                    *Sensitive to Criticism – Advocates aren’t averse to feedback – that is, unless they believe
                    that someone is challenging their most cherished principles or values.
                    *Prone to Burnout – Advocates’ perfectionism and reserve leave them with few options for
                    letting off steam.
                                            
                    CONCLUSION
                    Advocates’ gifts include idealism, determination, and the ability to envision a better
                    future – but they don’t just want to hear what makes them great. Advocates are committed
                    to actually using these gifts to become better people and serve a greater purpose in this world.
                    """, personalType, personalType);
            case "INFP" -> System.out.printf("""
                    %s
                    MEDIATOR
                    The %s Personality Types:
                                            
                    Although they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner
                    lives. Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts
                    of stories and conversations in their minds. These personalities are known for their sensitivity
                    – Mediators can have profound emotional responses to music, art, nature, and the people around
                    them.
                                            
                    Mediators share a sincere curiosity about the depths of human nature. Introspective to the core,
                    they’re exquisitely attuned to their own thoughts and feelings, but they yearn to understand the
                    people around them as well. Mediators are compassionate and nonjudgmental, always willing to hear
                    another person’s story. When someone opens up to them or turns to them for comfort, they feel
                    honored to listen and be of help
                                            
                    STRENGTH
                    *Empathetic – Mediators don’t just care about other people in an abstract sense.
                    *Open-Minded – Tolerant and accepting, Mediators try not to judge anyone else’s beliefs,
                    lifestyles, or decisions.
                    *Passionate – When an idea or movement captures their imagination, Mediators want to give
                    their whole heart to it.
                                            
                    WEAKNESS
                    *Unrealistic – Nothing in this world is perfect – and that can be a difficult truth for
                    Mediators to accept.
                    *Unfocused – Mediators’ imaginative, introspective nature doesn’t always lend itself to
                    productivity.
                    *Desperate to Please – Conflict tends to be stressful for Mediators, who yearn for harmony
                    and acceptance.
                                            
                    CONCLUSION
                    Now that you’ve learned the basics, the next step on your self-discovery journey is your Premium
                    Profile. Filled with Mediator-specific guidance and advice for every area of your life, from your
                    career to your relationships, your Premium Profile will empower you to understand what it really
                    means to be a Mediator – what it really means to be you. If you’re ready to create your own path
                    through life, move on to the next section.
                    """, personalType, personalType);
            case "ENFJ" -> System.out.printf("""
                    %s
                                            
                    PROTAGONIST
                    The %s Personality Types:
                    Protagonists (ENFJs) feel called to serve a greater purpose in life. Thoughtful and idealistic,
                    these personality types strive to have a positive impact on other people and the world around
                    them. They rarely shy away from an opportunity to do the right thing, even when doing so is far
                    from easy.
                    Protagonists tend to be vocal about their values, including authenticity and altruism. When
                    something strikes them as unjust or wrong, they speak up. But they rarely come across as brash
                    or pushy, as their sensitivity and insight guide them to speak in ways that resonate with others
                    When Protagonists care about someone, they want to help solve that person’s problems – sometimes
                    at any cost. The good news is that many people are grateful for Protagonists’ assistance and
                    advice.
                                            
                    STRENGTH
                    *Altruistic – These personalities are known for harboring a deep desire to be a force for
                    positive change.
                    *Passionate – Protagonists are far from being boring do-gooders. These types brim with interests
                    and they take great pleasure in pursuing their hobbies – whether that’s hiking, cooking,
                    dancing, growing houseplants, or something else entirely.
                    *Reliable – Few things bother Protagonists more than the prospect of letting down a person or
                    cause that they believe in.
                                            
                    WEAKNESS
                    *Unrealistic – Many Protagonists put pressure on themselves to right every wrong that they
                    encounter.
                    *Overly Idealistic – Protagonists tend to have clear ideas about what’s right and what’s wrong.
                    *Overly Empathetic – Compassion is among this personality type’s greatest strengths.
                                            
                    CONCLUSION
                    If you feel understood right now, it’s because you are. Years of research have given us fresh
                    insights into the unique strengths and challenges of Protagonists like you. We understand your
                    creativity, your passion, and your commitment to doing the right thing, but we also understand
                    the dark side of your personality type: the nagging fear that you might not reach your full
                    potential and make the most of your one wild and precious life.
                    Protagonists’ gifts include idealism, determination, and the ability to envision a better future
                    – but they don’t just want to hear what makes them great. Protagonists are committed to actually
                    using these gifts to serve a greater purpose.
                    """, personalType, personalType);
            case "ENFP" -> System.out.printf("""
                    %s
                                            
                    CAMPAIGN
                                            
                    The %s Personality Types:
                    Campaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. With their
                    lively, upbeat approach to life, they stand out in any crowd. But even though they can be the
                    life of the party, Campaigners don’t just care about having a good time.
                    Friendly and outgoing, Campaigners are devoted to enriching their relationships and their social
                    lives. But beneath their sociable, easygoing exteriors, they have rich, vibrant inner lives as
                    well. Without a healthy dose of imagination, creativity, and curiosity, a Campaigner simply
                    would’t be a Campaigner.
                    Campaigners are proof that seeking out life’s joys and pleasures isn’t the same as being shallow.
                    Seemingly in the blink of an eye, people with this personality type can transform from
                    impassioned idealists to carefree figures on the dance floor.
                    Campaigner personalities are capable of intense thought and feeling – and also of kicking back
                    and having a good time.
                                            
                    STRENGTH
                    *Curious – Campaigners can find beauty and fascination in nearly anything. Imaginative and
                    open-minded,
                    *Enthusiastic – When something captures their imagination and inspires them, Campaigners want to
                    share it with anyone who will listen.
                    *Festive – Campaigners may live for deep, meaningful conversations, but they can also be
                    spontaneous and lighthearted.
                                            
                    WEAKNESS
                    *People-Pleasing – Most Campaigners are uncomfortable with the prospect of being disliked.
                    *Unfocused – The thrill of a new project – especially one that involves collaborating with other
                    people – can bring out the best in Campaigners.
                    *Restless – With their positive, upbeat attitude, Campaigners rarely seem upset or dissatisfied
                    on the outside.
                                            
                    CONCLUSION
                    What you have read so far is just an introduction to the complexities of the Campaigner
                    personality type. You may have muttered to yourself, “Wow, this is so accurate, it’s a little
                    creepy,” or “Finally, someone understands me!” You may have even asked, “How do they know more
                    about me than the people I’m closest to do?”
                    You felt understood because you were. At 16Personalities, we’ve spent years studying Campaigners
                    like you – their hopes and dreams and frustrations, as well as what they need to grow into their
                    fullest, most brilliant potential.
                    """, personalType, personalType);
            case "ISFJ" -> System.out.printf("""
                    %s
                                            
                    LOGISTICAL
                    The %s Personality Types:
                    Logistics pride themselves on their integrity. People with this personality type mean what
                    they say, and when they commit to doing something, they make sure to follow through.
                    This personality type makes up a good portion of the overall population, and while Logistics
                    may not be particularly flashy or attention-seeking, they do more than their share to keep
                    society on a sturdy, stable foundation.
                    The core of Logistics’ self-respect comes from a sense of personal integrity. People with
                    this personality type believe that there is a right way to proceed in any situation – and that
                    anyone who pretends otherwise is probably trying to bend the rules to suit their own purposes.
                    Logistics’ dedication is an admirable quality, and it drives many of their accomplishments.
                    But it can also become a weakness that other people take advantage of. With their strong work
                    ethic and sense of duty, Logistics may routinely find themselves shouldering other people’s
                    responsibilities. Even if they don’t complain about the situation, Logistics can end up
                    exhausted or discouraged if they’re constantly expected – or taking it upon themselves – to pick
                    up the slack for their colleagues, friends, or loved ones.
                                            
                    STRENGTH
                    *Honest and Direct – Integrity is the heart of the Logistical personality type.
                    *Strong-willed and Dutiful – Logistics embody that integrity in their actions too, working
                    hard and staying focused on their goals.
                    *Create and Enforce Order – The primary goal of any Logistical is to be effective in what
                    they’ve chosen to do, and they believe that this is accomplished best when everyone involved
                    knows exactly what is going on and why.
                                            
                    WEAKNESS
                    *Stubborn – The facts are the facts, and Logistics tend to resist any new idea that isn’t
                    supported by them.
                    *Always by the Book – Logistics believe that things work best with clearly defined rules,
                    but this makes them reluctant to bend those rules or try new things, even when the downside is
                    minimal.
                    *Insensitive – While not intentionally harsh, Logistics often hurt more sensitive types’
                    feelings by the simple mantra that honesty is the best policy.
                                            
                    CONCLUSION
                    Yet Logistics can be easily tripped up in areas where their practical and methodical approach
                    are more of a liability than an asset. Whether it is finding (or keeping) a partner, learning to
                    relax or improvise, reaching dazzling heights on the career ladder, or managing their workload,
                    Logistics need to put in a conscious effort to develop their weaker traits and additional
                    skills.
                    """, personalType, personalType);
            case "ISTJ" -> System.out.printf("""
                    %s
                                            
                    DEFENDER
                    The %s Personality Types
                    In their unassuming, understated way, Defenders help make the world go round. Hardworking and
                    devoted, people with this personality type feel a deep sense of responsibility to those around
                    them. Defenders can be counted on to meet deadlines, remember birthdays and special occasions,
                    uphold traditions, and shower their loved ones with gestures of care and support. But they
                    rarely demand recognition for all that they do, preferring instead to operate behind the scenes.
                    For Defenders, “good enough” is rarely good enough. People with this personality type can be
                    meticulous to the point of perfectionism. They take their responsibilities personally,
                    consistently going above and beyond and doing everything that they can to exceed others’
                    expectations.
                                            
                    Although they’re Introverted, Defenders have a deeply social nature. Thanks to their ability to
                    remember the details of other people’s lives, Defenders have a special talent for making their
                    friends and acquaintances feel seen, known, and cherished. Few personality types can match
                    Defenders’ ability to choose just the right gift for any occasion, whether large or small.
                                            
                    Defenders tend to feel most energized and effective when they’re showing up for someone who
                    needs their help.
                                            
                    STRENGTH
                    *Supportive – Defenders truly enjoy helping others, and they happily share their knowledge,
                    attention, and expertise with anyone who needs it.
                    *Reliable – Rather than working in sporadic, excited bursts that leave things half finished,
                    Defenders are meticulous and careful.
                    *Hardworking – Defenders don’t just get their work done – they take pride in it.
                                            
                    WEAKNESS
                    *Repressing Their Feelings – Private and reserved, Defenders tend to internalize their feelings,
                    particularly negative ones.
                    *Overly Humble – Defenders are so concerned with other people’s feelings that they may refuse to
                    make their thoughts known or to take any duly earned credit for their contributions.
                    *Reluctant to Change – Defenders are among the personality types that struggle the most with
                    change.
                                            
                    CONCLUSION
                    Defenders’ gifts include generosity, patience, and determination – but they aren’t people who
                    just want to hear what makes them great. Defenders are committed to actually using these gifts
                    to become better people and be of service to others.
                    That’s why we’ve made it our mission to help Defenders like you not only appreciate your
                    strengths but also make the most of them.
                    """, personalType, personalType);
            case "ESTJ" -> System.out.printf("""
                    %s
                                            
                    EXECUTIVE
                    The %s Personality Types
                    Executives are representatives of tradition and order, utilizing their understanding of what is
                    right, wrong and socially acceptable to bring families and communities together. Embracing the
                    values of honesty, dedication and dignity, people with the Executive personality type are valued
                    for their clear advice and guidance, and they happily lead the way on difficult path.
                    Demand for such leadership is high in democratic societies, and forming no less than 11percent
                    of the population, it’s no wonder that many of America’s presidents have been Executives.
                    Strong believers in the rule of law and authority that must be earned, Executive personalities
                    lead by example, demonstrating dedication and purposeful honesty, and an utter rejection of
                    laziness and cheating, especially in work.
                    Executives are classic images of the model citizen: they help their neighbors, uphold the law,
                    and try to make sure that everyone participates in the communities and organizations they hold
                    so dear
                                            
                    STRENGTHS
                    *Dedicated – Seeing things to completion borders on an ethical obligation for Executives.
                    *Strong-willed – A strong will makes this dedication possible, and Executives don’t give up their
                    beliefs because of simple opposition.
                    *Loyal, Patient and Reliable – Executives work to exemplify truthfulness and reliability,
                    considering stability and security very important.
                                            
                    WEAKNESS
                    *Inflexible and Stubborn – The problem with being so fixated on what works is that Executives
                    too often dismiss what might work better.
                    *Uncomfortable with Unconventional Situations – Executives are strong adherents to tradition and
                    when suddenly forced to try unsetted solutions, they become uncomfortable and stressed.
                    *Judgmental – Executives have strong convictions about what is right, wrong, and socially
                    acceptable.
                                            
                    CONCLUSION
                    Few personality types are as practical and strong-willed as Executives. Known for their
                    reliability and administrative skills, Executives are good at creating and maintaining a secure
                    and stable environment for themselves and their loved ones. Executives’ dedication is invaluable
                    in many areas, including their own personal growth.
                                            
                    Yet Executives can be easily tripped up in areas where their rational and practical approach is
                    more of a liability than an asset.
                    """, personalType, personalType);
            case "ESFJ" -> System.out.printf("""
                    %s
                                            
                    CONSUL
                    The %s Personality Types:
                    For Consuls, life is sweetest when it’s shared with others. People with this personality type
                    form the bedrock of many communities, opening their homes – and their hearts – to friends, loved
                    ones, and neighbors.
                                            
                    This does’t mean that Consuls like everyone, or that they’re saints. But Consuls do believe in
                    the power of hospitality and good manners, and they tend to feel a sense of duty to those around
                    them. Generous and reliable, people with this personality type often take it upon themselves –
                    in ways both large and small – to hold their families and their communities together.
                    Consuls have a talent for making the people in their lives feel supported, cared for, and secure.
                                            
                    Supportive and outgoing, Consuls can always be spotted at a party – they’re the ones fluttering
                    around making sure that everyone else is having a good time! But make no mistake: Consuls don’t
                    just breeze through other people’s lives. Loyal to the core, they build lasting relationships,
                    and they can be counted on to show up whenever a helping hand – or a listening ear – is needed
                                            
                    STRENGTH
                    *Strong Practical Skills – Consuls are excellent managers of day-to-day tasks and routine
                    maintenance, enjoying making sure that those who are close to them are well cared for.
                    *Strong Sense of Duty – People with the Consul personality type have a strong sense of
                    responsibility and strive to meet their obligations,
                    *Good at Connecting with Others – These qualities come together to make Consuls social,
                    comfortable and well-liked.
                                            
                    WEAKNESS
                    *Vulnerable to Criticism – It can be especially challenging to change these tendencies because
                    Consuls are so conflict-averse.
                    *Often Too Needy – Consuls need to hear and see a great deal of appreciation.
                    *Too Selfless – The other side of this is that Consuls sometimes try to establish their value
                    with doting attention,
                                            
                    CONCLUSION
                    Few personality types are as practical and caring as Consuls. Known for their social and
                    administrative skills, Consuls are good at creating and maintaining a secure, stable and
                    friendly environment for themselves and their loved ones. Consuls’ dedication is invaluable in
                    many areas, including their own personal growth.
                    """, personalType, personalType);
            case "ISTP" -> System.out.printf("""
                    %s
                                            
                    VIRTUOSO
                    The %s Personality Types:
                    Virtuosos love to explore with their hands and their eyes, touching and examining the world
                    around them with cool rationalism and spirited curiosity. People with this personality type are
                    natural Makers, moving from project to project, building the useful and the superfluous for the
                    fun of it, and learning from their environment as they go. Often mechanics and engineers,
                    Virtuosos find no greater joy than in getting their hands dirty pulling things apart and putting
                    them back together, just a little bit better than they were before.
                                            
                    While their mechanical tendencies can make them appear simple at a glance, Virtuosos are actually
                    quite enigmatic. Friendly but very private, calm but suddenly spontaneous, extremely curious
                    but unable to stay focused on formal studies, Virtuoso personalities can be a challenge to
                    predict, even by their friends and loved ones.
                                            
                    STRENGTH
                    *Optimistic and Energetic – Virtuosos are usually up to their elbows in some project or other.
                    *Creative and Practical – Virtuosos are very imaginative when it comes to practical things,
                    mechanics, and crafts.
                    *Great in a Crisis – With all this hands-on creativity and spontaneity, it’s no wonder that
                    Virtuosos are naturals in crisis situations.
                                            
                    WEAKNESS
                    *Stubborn – As easily as Virtuosos go with the flow, they can also ignore it entirely, and
                    usually move in another direction with little apology or sensitivity.
                    *Private and Reserved – Virtuoso personalities are notoriously difficult to get to know.
                    *Dislike Commitment – Long-term commitments are particularly onerous for Virtuosos.
                                            
                    CONCLUSION
                    This is not a trick. You felt understood because you were. We’ve studied how Virtuosos think and
                    what they need to reach their full potential. And no, we did not spy on you – many of the
                    challenges you’ve faced and will face in the future have been overcome by other Virtuosos. You
                    simply need to learn how they succeeded.
                    But in order to do that, you need to have a plan, a personal roadmap.
                    """, personalType, personalType);
            case "ISFP" -> System.out.printf("""
                    %s
                                            
                    ADVENTURER
                    The %s Personality Types:
                    Adventurers are true artists – although not necessarily in the conventional sense. For this
                    personality type, life itself is a canvas for self-expression. From what they wear to how they
                    spend their free time, Adventurers act in ways that vividly reflect who they are as unique
                    individuals.
                    And every Adventurer is certainly unique. Driven by curiosity and eager to try new things, people
                    with this personality often have a fascinating array of passions and interests. With their
                    exploratory spirits and their ability to find joy in everyday life, Adventurers can be among the
                    most interesting people you’ll ever meet. The only irony? Unassuming and humble, Adventurers tend
                    to see themselves as “just doing their own thing,” so they may not even realize how remarkable
                    they really are.
                                            
                    STRENGTH
                    *Charming – People with the Adventurer personality type are relaxed and warm, and their “live and
                    let live” attitude naturally makes them likable and popular.
                    *Sensitive to Others – Adventurers easily relate to others’ emotions, helping them to establish
                    harmony and good will, and minimize conflict.
                    *Artistic – Adventurers are able to show their creativity in tangible ways and with stunning
                    beauty.
                                            
                    WEAKNESS
                    *Fiercely Independent – Freedom of expression is often Adventurers’ top priority.
                    *Unpredictable – Adventurers’ dislike long-term commitments and plans.
                    *Fluctuating Self-Esteem – It’s demanded that skills be quantified, but that’s hard to do with
                    Adventurers’ strengths of sensitivity and artistry.
                                            
                    CONCLUSION
                    Yet Adventurers can be easily tripped up in areas where their focus on practical matters is more
                    of a liability than an asset. Whether it is finding (or keeping) a partner, reaching dazzling
                    heights on the career ladder, or learning to plan ahead, Adventurers need to put in a conscious
                    effort to develop their weaker traits and additional skills.
                    """, personalType, personalType);
            case "ESTP" -> System.out.printf("""
                    %s
                                            
                    ENTREPRENEUR
                    The %s Personality Types:
                    Entrepreneurs always have an impact on their immediate surroundings – the best way to spot them
                    at a party is to look for the whirling eddy of people flitting about them as they move from
                    group to group. Laughing and entertaining with a blunt and earthy humor, Entrepreneur
                    personalities love to be the center of attention. If an audience member is asked to come on
                    stage, Entrepreneurs volunteer – or volunteer a shy friend.
                                            
                    With perhaps the most perceptive, unfiltered view of any type, Entrepreneurs have a unique skill
                    in noticing small changes. Whether a shift in facial expression, a new clothing style, or a
                    broken habit, people with this personality type pick up on hidden thoughts and motives where most
                    types would be lucky to pick up anything specific at all. Entrepreneurs use these observations
                    immediately, calling out the change and asking questions, often with little regard for
                    sensitivity.
                                            
                    STRENGTH
                    *Bold – People with the Entrepreneur personality type are full of life and energy.
                    *Rational and Practical – Entrepreneurs love knowledge and philosophy, but not for their own sake.
                    *Direct – This perceptive skill isn’t used for mind games – Entrepreneurs prefer to communicate
                    clearly, with direct and factual questions and answers.
                                            
                    WEAKNESS
                    *Impatient – Entrepreneurs move at their own pace to keep themselves excited.
                    *May Miss the Bigger Picture – Living in the moment can cause Entrepreneurs to miss the forest
                    for the trees.
                    *Defiant – Entrepreneurs won’t be boxed in. Repetition, hardline rules, sitting quietly while
                    they are lectured
                                            
                    CONCLUSION
                    Yet Entrepreneurs can be easily tripped up in situations where their focus on practical matters
                    is more of a liability than an asset. Whether it is finding (or keeping) a partner, reaching
                    dazzling heights on the career ladder, or learning to plan ahead, Entrepreneurs need to put in a
                    conscious effort to develop their weaker traits and additional skills.
                    What you have read so far is just an introduction into the complex concept that is the
                    Entrepreneur personality type. You may have muttered to yourself, “wow, this is so accurate it’s
                    a little creepy” or “finally, someone understands me!”
                    """, personalType, personalType);
            case "ESFP" -> System.out.printf("""
                    %s
                                            
                    ENTERTAINERS
                    The %s Personality Types:
                    If anyone is to be found spontaneously breaking into song and dance, it is the Entertainer
                    personality type. Entertainers get caught up in the excitement of the moment, and want everyone
                    else to feel that way, too. No other personality type is as generous with their time and energy
                    as Entertainers when it comes to encouraging others, and no other personality type does it with
                    such irresistible style.
                    The biggest challenge Entertainers face is that they are often so focused on immediate pleasures
                    that they neglect the duties and responsibilities that make those luxuries possible. Complex
                    analysis, repetitive tasks, and matching statistics to real consequences are not easy activities
                    for Entertainers. They’d rather rely on luck or opportunity, or simply ask for help from their
                    extensive circle of friends. It is important for Entertainers to challenge themselves to keep
                    track of long-term things like their retirement plans or sugar intake
                                            
                    STRENGTH
                    *Bold – Entertainers aren’t known for holding back. Wanting to experience everything there is
                    to experience,
                    *Practical – To Entertainers, the world is meant to be felt and experienced.
                    *Excellent People Skills – More so than things though, Entertainers love to pay attention to
                    people.
                                            
                    WEAKNESS
                    *Conflict-Averse – Entertainers sometimes ignore and avoid conflict entirely.
                    *Poor Long-Term Planners – In fact, Entertainer personalities rarely make detailed plans for the
                    future.
                    *Unfocused – Anything that requires long-term dedication and focus is a particular challenge for
                    Entertainers.
                                            
                    CONCLUSION
                    But in order to do that, you need to have a plan, a personal roadmap. The best car in the world
                    will not take you to the right place if you do not know where you want to go. We have told you
                    how Entertainers tend to behave in certain circumstances and what their key strengths and
                    weaknesses are. Now we need to go much deeper into your personality type and answer “why?”,
                    “how?” and “what if?”
                    """, personalType, personalType);
        }
        }
    }
