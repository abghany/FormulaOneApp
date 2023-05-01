package com.gnacoding.formulaoneapp.data.data_source

import com.gnacoding.formulaoneapp.R
import com.gnacoding.formulaoneapp.domain.model.Driver

object DriverDataSource {
    val dummyDrivers = listOf(
        Driver(
            name = "Lewis Hamilton",
            raceNumber = "44",
            nationality = R.drawable.united_kingdom,
            profilePicture = R.drawable.lewis_hamilton,
            teamConstructor = "Mercedes-AMG",
            totalPodium = "192",
            totalPoints = "4443.5",
            totalWorldChampionship = "7",
            biography = "‘Still I Rise’ – these are the words emblazoned across the back of Lewis Hamilton’s helmet and tattooed across his shoulders, and ever since annihilating expectations with one of the greatest rookie performances in F1 history in 2007, that’s literally all he’s done: risen to the top of the all-time pole positions list ahead of his hero Ayrton Senna, surged into first place in the wins column surpassing the inimitable Michael Schumacher, and then matched the legendary German’s seven world titles.\n" +
                    "Is he the G.O.A.T? Few would deny that he’s in the conversation – and what’s more he’s got there his way, twinning his relentless speed with a refusal to conform to stereotypes for how a racing driver should think, dress or behave.\n" +
                    "Respect is hard earned in F1, but Hamilton – now Sir Lewis Hamilton to be precise – has it from every one of his peers. Why? Because they know that whatever the track, whatever the conditions, whatever the situation, when his visor goes down and the lights go out, it’s Hammertime."
        ),
        Driver(
            name = "George Russel",
            raceNumber = "63",
            nationality = R.drawable.united_kingdom,
            profilePicture = R.drawable.george_russel,
            teamConstructor = "Mercedes-AMG",
            totalPodium = "9",
            totalPoints = "312",
            totalWorldChampionship = "N/A",
            biography = "He’s the driver with the motto: “If in doubt, go flat out”.\n" +
                    "George Russell has lived by it throughout his F1 career to date, out-qualifying seasoned team mate Robert Kubica at all 21 Grands Prix in his rookie season, putting Williams back on the podium in 2021, and landing his first race win with Mercedes in 2022.\n" +
                    "That brilliant baseline speed served Russell well as he totted up titles on his way to Formula 1. The Briton stormed to the 2017 GP3 championship and delivered the 2018 Formula 2 crown under immense pressure.\n" +
                    "Spotting his potential, world champions Mercedes swooped to sign him to their junior programme in 2017, when Russell already had a DTM deal on the table. He banked more experience with practice sessions with Force India and tests for the Silver Arrows, before landing his Mercedes-powered Williams race drive.\n" +
                    "A refusal to cede ground to his rivals - and commitment to a tricky pass – underpins Russell’s winning mentality. And it’s what got him the call-up to replace Lewis Hamilton for a one-off Mercedes appearance for Sakhir 2020 when the reigning champ was struck down by Covid-19.\n" +
                    "That star turn saw Russell miss out on pole by just 0.026s and then outrace Mercedes stalwart Valtteri Bottas. Only a bungled pit stop and a heart-breaking late puncture prevented a near-certain maiden win for the up-and-coming super-sub. "
        ),
        Driver(
            name = "Max Verstappen",
            raceNumber = "1",
            nationality = R.drawable.netherlands,
            profilePicture = R.drawable.max_verstappen,
            teamConstructor = "Red Bull Racing",
            totalPodium = "80",
            totalPoints = "2080.5",
            totalWorldChampionship = "2",
            biography = "He’s Max by name, and max by nature.\n" +
                    "Arriving as Formula 1’s youngest ever competitor at just 17 years old, Verstappen pushed his car, his rivals and the sport’s record books to the limit. The baby-faced Dutchman with the heart of a lion took the Toro Rosso – and then the Red Bull – by the horns with his instinctive racing style.\n" +
                    "F1’s youngest points scorer soon became its youngest race winner – at the age of 18 years and 228 days – with an opportunistic but controlled drive on debut for Red Bull in Barcelona 2016. A true wheel-to-wheel racer, another stunning drive in Brazil from the back of the pack to the podium on a treacherous wet track kept the plaudits coming.\n" +
                    "Verstappen’s no-holds-barred attitude and hard defending have sometimes landed him in hot water with his peers and paymasters. But the mistakes that initially marred his potential have given way to maturity, while the bravado and energy that make him a blockbuster talent have remained – and the victories have kept on coming.\n" +
                    "They culminated in his first F1 drivers’ crown after that already legendary, final-round showdown with Lewis Hamilton in 2021. And he followed that up with a powerhouse title defence in 2022, winning a record 15 races across the season.\n" +
                    "The son of former F1 driver Jos Verstappen and super-quick karting Mum Sophie Kumpen, racing runs through his genes. Despite moving out of Dad’s house to live in Monaco, Verstappen remains close to his family, and though he’s not afraid to speak his mind, he can still be surprisingly shy.\n" +
                    "Having become the Netherlands' first world champion aged just 24, the expectations for the next generation’s leading light are sky high – but with Verstappen there’s a feeling that the sky’s the limit."
        ),
        Driver(
            name = "Sergio Perez",
            raceNumber = "11",
            nationality = R.drawable.mexico,
            profilePicture = R.drawable.sergio_perez,
            teamConstructor = "Red Bull Racing",
            totalPodium = "28",
            totalPoints = "1255",
            totalWorldChampionship = "N/A",
            biography = "He’s the fighter with a gentle touch from the land of the Lucha Libre.\n" +
                    "Perez’s reputation in F1 has been built on opposite approaches to Grand Prix racing. On the one hand, he is a punchy combatant who wrestles his way through the pack and into the points. Never afraid to add a bit of spice to his on-track encounters, even his team mates don’t always escape the Mexican’s heat.\n" +
                    "Then on the other hand, Perez is a smooth operator, a master at managing tyres to eke out extra performance and give him the upper hand on strategy. A firm favourite on the grid after his time with Sauber, McLaren, Force India and Racing Point, Perez has matured into an analytical racer and team player.\n" +
                    "A proud countryman, the Guadalajara gunslinger has amassed more points than any other Mexican in the history of F1. In Sakhir 2020 he also matched hero and compatriot Pedro Rodriguez by taking the chequered flag in first – a performance that landed him a seat with title contenders Red Bull.\n" +
                    "There he provided strong support to Max Verstappen’s 2021 and '22 championship-winning campaigns, also adding a further three victories to his own tally. More wins may not be assured, especially with Verstappen as team mate, but Perez working hard and racing with his heart are."
        ),
        Driver(
            name = "Charles Leclerc",
            raceNumber = "16",
            nationality = R.drawable.monaco,
            profilePicture = R.drawable.charles_leclerc,
            teamConstructor = "Ferrari",
            totalPodium = "24",
            totalPoints = "874",
            totalWorldChampionship = "N/A",
            biography = "Born in the Mediterranean idyll of Monaco, Leclerc arrived in F1 on a tidal wave of expectation. \n" +
                    "Practically peerless on his way to the GP3 and Formula 2 crowns, he showcased a dazzling array of skills from scorching pole positions, commanding victories – even when his car caught fire twice at Silverstone – to an ability to muscle his way through the pack. Winning back-to-back championships also taught Leclerc how to handle pressure, another useful tool in the big pond of Formula 1 racing.\n" +
                    "Stepping up to F1 in 2018, Leclerc showed flashes of ballistic pace on Saturdays and racing brilliance on Sundays, dragging his Sauber beyond its limits – and earning himself a money-can’t-buy race seat at Ferrari for 2019, stepping into the shoes of the Scuderia’s last world champion, Kimi Raikkonen. \n" +
                    "There he immediately put the cat among the proverbial pigeons, unafraid to go wheel-to-wheel with established number one, Sebastian Vettel. A maiden F1 victory at Spa was followed by another a week later on Ferrari’s hallowed home turf of Monza. The tifosi had found another new hero – who then became the first man to out-score Vettel over a season with the Scuderia, a feat he repeated in crushing fashion the following year.\n" +
                    "The 2020 and ’21 seasons bore little fruit for Ferrari, but Leclerc maintained his resolve to emerge a true title contender in 2022. With three wins, 11 podiums and nine pole positions, he was the only man able to consistently take the fight to champion Max Verstappen.\n" +
                    "Out of the car, Leclerc is modest and thoughtful - but then he is on his own very personal mission. This exciting young talent is racing for his late father Herve and his friend and mentor Jules Bianchi, the F1 driver who died in 2015. \n" +
                    "On the evidence so far, he is doing them both proud."
        ),
        Driver(
            name = "Carlos Sainz",
            raceNumber = "55",
            nationality = R.drawable.spain,
            profilePicture = R.drawable.carlos_sainz,
            teamConstructor = "Ferrari",
            totalPodium = "15",
            totalPoints = "802.5",
            totalWorldChampionship = "N/A",
            biography = "He’s the matador from Madrid racing royalty. \n" +
                    "After entering F1’s Bull Ring paired alongside Max Verstappen at Toro Rosso in 2015, Sainz quickly showed his fighting spirit. A tenacious racer, he puts the car on the edge as he hustles his way through the pack. No wonder Sainz has earned the nickname Chilli.\n" +
                    "But the Spaniard is intelligent as well as instinctive, thinking his way through a race and into the points. This calm temperament follows him off track where he remains unfazed by the pressures of forging a Grand Prix career with a famous name. \n" +
                    "Sainz is the son of double World Rally champion, also his namesake, and has brought some of Dad’s driving skills to the F1 circuit – junior loves a delicious dose of drift for one.\n" +
                    "After following in his famous father’s tyre tracks, Sainz has had big racing boots to fill – first at McLaren where he replaced his childhood hero Fernando Alonso, and now at Ferrari, in the seat formerly owned by Sebastian Vettel. \n" +
                    "It is never easy living in the shadow of sporting giants, but Sainz has shown the drive and disposition to deal with it, and in 2022 he took his maiden F1 win with victory at Silverstone. Vamos!"
        ),
        Driver(
            name = "Fernando Alonso",
            raceNumber = "14",
            nationality = R.drawable.spain,
            profilePicture = R.drawable.fernando_alonso,
            teamConstructor = "Aston Martin",
            totalPodium = "101",
            totalPoints = "2106",
            totalWorldChampionship = "2",
            biography = "Michael Schumacher was the undisputed king of Formula 1 in the early 2000s, picking up wins and championships at a rate that was simply unheard of at the time. It was going to take someone very special to topple the Ferrari legend from his throne – and that it was Fernando Alonso who did it, tells you all you need to know about the Spaniard.\n" +
                    "Fiercely competitive, Alonso is not shy about his talent, rating himself as 9/10 “in everything”, and few in the know would disagree, with his performances in F1 characterised by blistering speed, brilliant tactical thinking, exemplary race craft, a razor-sharp eye for detail and a relentless determination to win.\n" +
                    "A serial record breaker in his early days, he was – at one time – F1’s youngest polesitter, race winner, world champion and double world champion as he gobbled up success with the Renault team. Even Alonso couldn’t continue that amazing run in his later career though, failing to add another title to his collection despite spells at McLaren and Ferrari.\n" +
                    "But after two years away from Formula 1 racing – and with two Le Mans wins in his pocket – Alonso returned with Alpine in 2021. His speed and determination undiminished, he was back on the podium that year, but frustrated by poor reliability – and the lack of a long-term contract – the following season, he opted to jump ship once more.\n" +
                    "Now Alonso hopes Aston Martin will be the team with whom he finally returns to winning ways, as he has unfinished business with F1."
        ),
        Driver(
            name = "Lance Stroll",
            raceNumber = "18",
            nationality = R.drawable.canada,
            profilePicture = R.drawable.lance_stroll,
            teamConstructor = "Aston Martin",
            totalPodium = "3",
            totalPoints = "214",
            totalWorldChampionship = "N/A",
            biography = "There is no such thing as too much too soon for Stroll, a teenage sensation with a wet weather predilection. One of the cool kids on the grid, Stroll was unveiled shortly after his 18th birthday by Williams – before he finished high school and got his road licence. Stroll meant business in his debut 2017 season, setting records on the way. An opportunistic racer he bounded onto the podium in Baku, the youngest rookie to do so. As the son of a wealthy entrepreneur, Stroll is used to a champagne lifestyle but now he knows the fizz tastes all the sweeter on the rostrum. Then in Monza he mastered the downpours to become the youngest driver in history to line up on the front row. A single-minded starter, the Canadian loves to make up places on the opening lap and fight through to the points. Stroll has the potential to be a long-term fixture in Formula 1 – as amply illustrated by a maiden pole and another two podiums in 2020. Those came after his father Lawrence led the consortium that took over Force India midway through the 2018 season, and then transformed it from Racing Point to Aston Martin for 2021. The future looks bright for both the team and their young driver – and even if it rains then Stroll can keep on motoring at the sharp end of the pack."
        ),
        Driver(
            name = "Lando Norris",
            raceNumber = "4",
            nationality = R.drawable.united_kingdom,
            profilePicture = R.drawable.lando_norris,
            teamConstructor = "McLaren",
            totalPodium = "6",
            totalPoints = "436",
            totalWorldChampionship = "N/A",
            biography = "Lando Norris may not be named after Star Wars rebel Lando Calrissian - his Mum just liked the moniker - but he has flair and fighting spirit in bountiful supply. McLaren had the British teenager on their books for two years before fast-tracking him into F1’s galaxy of stars in 2019. A firecracker in his junior career, with a penchant for pole positions and wheel-to-wheel tussles, Norris didn’t let them down. Paired with the highly-rated – and far more experienced – Carlos Sainz, his rookie season was impressive, Norris edging the Spaniard in their head-to-head qualifying battle, scoring points 11 times, and only narrowly missing out on a top-10 championship placing. A maiden podium came in 2020, with more following in the subsequent two seasons – he narrowly missed out on a win at Russia 2021 – as he dominated another more senior team mate, Daniel Ricciardo, to firmly establish himself in F1’s top tier."
        ),
        Driver(
            name = "Oscar Piastri",
            raceNumber = "81",
            nationality = R.drawable.australia,
            profilePicture = R.drawable.oscar_piastri,
            teamConstructor = "McLaren",
            totalPodium = "N/A",
            totalPoints = "4",
            totalWorldChampionship = "N/A",
            biography = "Born in Melbourne, just a stone’s throw away from the Australian Grand Prix venue, a young Oscar Piastri’s dreams of one day racing in Formula 1 were ignited by the sport’s star drivers roaring around his local streets, otherwise known as Albert Park. But it would take huge commitment and sacrifice to turn that dream into a reality, with a move to Europe – made by the likes of fellow countrymen Mark Webber and Daniel Ricciardo before him – the only way to go up against the best and catch the attention of the sport’s decision-makers. Using success on the Australian karting scene as a springboard, Piastri continued to learn the craft in championships across Europe, before getting his first taste of single-seater competition as a 15-year-old – two podium finishes in F4 UAE a sign of things to come. From there, success flowed. British F4 runner-up. Formula Renault champion. F3 champion. F2 champion (by more than 50 points). Piastri did not simply climb the junior single-seater ladder, he charged up it to knock loudly on the F1 door."
        ),
        Driver(
            name = "Pierre Gasly",
            raceNumber = "10",
            nationality = R.drawable.france,
            profilePicture = R.drawable.pierre_gasly,
            teamConstructor = "Alpine",
            totalPodium = "3",
            totalPoints = "336",
            totalWorldChampionship = "N/A",
            biography = "If there’s one man who knows how big a rollercoaster ride an F1 driver’s career can be, it’s Pierre Gasly! The flying Frenchman was called up to make his 2017 debut in Malaysia in place of Daniil Kvyat and, after proving his mettle, he was named a Toro Rosso driver the following year.  A further 21 races into his fledgling career, Gasly was moved up again – this time to replace Red Bull big gun Daniel Ricciardo. Gasly seemed to have a knack of being in the right place at the right time – a quality that’s equally handy on track. A series of impressive 2018 performances for Toro Rosso – including a brilliant fourth place in Bahrain – showed exciting promise for what he might do with the ‘A’ team in 2019. Unfortunately that promise only appeared in flashes – and he quickly suffered from unfavourable comparisons with superstar team mate Max Verstappen. So much so that after the summer break, he was sent back to Toro Rosso, with another young up-and-comer – Alex Albon – being given a shot in the ‘senior’ Red Bull seat. But Gasly bounced back, as only Gasly can. In the season’s remaining nine races he scored almost as many points as team mate Kvyat managed over the entire year – and secured his best-ever race result with P2 in Brazil. That trajectory continued in 2020, peaking with an emotional maiden win at the renamed AlphaTauri team’s home race in Italy, and didn’t let up in 2021 when he was back on the podium and scored 110 of the squad’s 142 points. When AlphaTauri’s momentum stalled in 2022, Gasly decided it was time for a change – in the form of French team Alpine, with fellow Frenchman – and old adversary – Esteban Ocon as team mate.  The question now is can he regain momentum and get himself another shot at the F1 bigtime…"
        ),
        Driver(
            name = "Esteban Ocon",
            raceNumber = "31",
            nationality = R.drawable.france,
            profilePicture = R.drawable.esteban_ocon,
            teamConstructor = "Alpine",
            totalPodium = "2",
            totalPoints = "368",
            totalWorldChampionship = "N/A",
            biography = "If there’s one word that dominates Esteban Ocon’s career, it’s ‘sacrifice’. Back when he was just a promising karter, Ocon’s parents sold their house, put their jobs on hold, and began a life on the road, living in a caravan and travelling from circuit to circuit to support their son’s burgeoning career. Sacrifice, see – but it worked. 2014 saw Ocon break through in the world of single-seaters, as he beat a certain Max Verstappen to the European F3 title. Backed by Mercedes, he won the GP3 title the following year and was halfway through a season of DTM in 2016 when he was offered the chance to replace Rio Haryanto at the minnow Manor team from the Belgian Grand Prix onwards. That opportunity led to a full-time seat the following year with Force India, where his wheel-to-wheel duels with highly-rated team mate Sergio Perez quickly marked him out as a rising star. But when Lawrence Stroll, father of racer Lance, stepped in midway through 2018 to secure the squad’s financial future, the writing was on the wall for Ocon, who was moved aside at the end of the year to allow Stroll Jnr to join from Williams."
        ),
        Driver(
            name = "Valtteri Bottas",
            raceNumber = "77",
            nationality = R.drawable.finland,
            profilePicture = R.drawable.valtteri_bottas,
            teamConstructor = "Alfa Romeo",
            totalPodium = "67",
            totalPoints = "1791",
            totalWorldChampionship = "N/A",
            biography = "Learning his craft on Finnish roads of ice and snow, he was born to be a Grand Prix racer.Bottas explains that if you can drive on the frozen roads of his homeland then you can drive anywhere. Then there’s the Finnish mentality –reserved, diligent and calm the fast lane of F1 doesn’t faze him. Making his F1 debut with Williams in 2013, Bottas soon became part of the family. Points and podiums followed with the reliable racer even amassing the most points without a win, a record he resented but that showcased his ability. The fact the Finn was such a points machine saw him suddenly promoted to the most coveted seat in F1 - Nico Rosberg’s vacant championship-winning seat at Mercedes. Bottas blossomed at the Silver Arrows in 2017, unleashing his pace to clock up personal pole positions and victories as well as a team championship for the famous Mercedes marque alongside Lewis Hamilton. He even tied with Hamilton and Sebastian Vettel with 13 podiums."
        ),
        Driver(
            name = "Zhou Guanyu",
            raceNumber = "24",
            nationality = R.drawable.china,
            profilePicture = R.drawable.zhou_guanyu,
            teamConstructor = "Alfa Romeo",
            totalPodium = "N/A",
            totalPoints = "8",
            totalWorldChampionship = "N/A",
            biography = "China has never boasted a Grand Prix starter among its citizens – but Zhou Guanyu is the driver charged with changing that state of affairs, after receiving the call-up to make his F1 debut for Alfa Romeo in 2022. The Shanghai-born racer attended his home city’s inaugural Grand Prix in 2004 at the age of five, cheering on his hero Fernando Alonso. But having caught the racing bug, the Chinese driver then set himself the ambitious goal of becoming his country’s first-ever F1 racer – achieving a feat that Ma Qinghua, the only other Chinese driver to take part in a Formula 1 weekend, never managed. Showing boldness and dedication, Zhou put his plan into action by moving to England with his family aged just 12 to pursue his motorsport ambitions. A second-place finish in the 2015 Italian F4 championship proved Zhou was possessed of the right stuff – a fact already noted by Ferrari, who’d signed him to their driver academy a year earlier."
        ),
        Driver(
            name = "Kevin Magnussen",
            raceNumber = "20",
            nationality = R.drawable.denmark,
            profilePicture = R.drawable.kevin_magnussen,
            teamConstructor = "Haas F1 Team",
            totalPodium = "1",
            totalPoints = "184",
            totalWorldChampionship = "N/A",
            biography = "Call him a lone ranger or a maverick, but Magnussen is back in Formula 1 for one reason only – to race. He may be a second-generation F1 driver – following his father, Jan, onto the grid – but Magnussen’s idols are from the ‘golden era’ of Grand Prix racing when the likes of Juan Manuel Fangio and Stirling Moss risked it all for the love of the sport. The Roskilde racer’s own prowess was proven on debut for McLaren, who guided him through the junior ranks, when he cruised into the top-three at the 2014 Australian Grand Prix, becoming the first Dane to claim a podium in F1."
        ),
        Driver(
            name = "Nico Hulkenberg",
            raceNumber = "27",
            nationality = R.drawable.germany,
            profilePicture = R.drawable.nico_hulkenberg,
            teamConstructor = "Haas F1 Team",
            totalPodium = "N/A",
            totalPoints = "527",
            totalWorldChampionship = "N/A",
            biography = "He’s the Superhero with the talent to become a racing superstar – if only he could get to flex his muscles with a top team. F1’s 'Hulk' has shown incredible strength and stamina as a midfield marauder for Williams, Force India, Sauber, Renault, Racing Point and Aston Martin during a career spanning back to 2010 – and now he is back on the grid with Haas. In that rookie season, Hulkenberg mastered changing track conditions to take a brilliant pole position in Brazil, showing he had brains as well as brawn. Since then his ability to consistently hoover up the points has made him a highly valued team player. In 2015, his reputation grew once more when, on a weekend away from his day job, he won the classic Le Mans 24 Hours race for Porsche at the first time of asking."
        ),
        Driver(
            name = "Yuki Tsunoda",
            raceNumber = "22",
            nationality = R.drawable.japan,
            profilePicture = R.drawable.yuki_tsunoda,
            teamConstructor = "AlphaTauri",
            totalPodium = "N/A",
            totalPoints = "45",
            totalWorldChampionship = "N/A",
            biography = "In the entire history of Formula 1, no Japanese driver has ever won a World Championship Grand Prix. Could Yuki Tsunoda be the first? Red Bull certainly think so, with the youngster very much on the path to their senior team if he continues to impress as he has done over the past few years. Tsunoda's ascent to the top tier of motorsport was astonishingly rapid: he went from racing in Japanese F4 to a Formula 1 seat with AlphaTauri in just over three years, having arrived in Europe in 2019 with no knowledge of the circuits. But after a slow start in F3, followed by a hugely impressive debut F2 campaign that saw him finish third in the championship and pick up three wins along the way, Tsunoda proved he had the speed and the race craft to force his way on to the F1 grid."
        ),
        Driver(
            name = "Nyck De Vries",
            raceNumber = "22",
            nationality = R.drawable.netherlands,
            profilePicture = R.drawable.nyck_de_vries,
            teamConstructor = "AlphaTauri",
            totalPodium = "N/A",
            totalPoints = "2",
            totalWorldChampionship = "N/A",
            biography = "Nyck de Vries had to wait until he was 27 years old for a shot at racing in F1, but it was an opportunity the Dutchman grabbed with both hands to become one of the hottest options on the driver market and ultimately land a full-time deal with AlphaTauri. Well-versed with F1 machinery thanks to his Mercedes reserve role, which included several FP1 runs for the works and supplier teams in 2022-spec cars, De Vries slotted in seamlessly when Williams unexpectedly called him up to replace the unwell Alex Albon at the 2022 Italian Grand Prix. Embracing the pressure of the moment, De Vries out-qualified and out-raced regular driver Nicholas Latifi to take the chequered flag in a highly-impressive ninth place, adding two valuable points to Williams’ tally and landing plenty of praise. The performance cemented the views of many in the F1 paddock, including Toto Wolff, who saw De Vries lift the Formula E title with Mercedes in the 2020-21 season, adding to a trophy cabinet that also includes F2 and Formula Renault titles."
        ),
        Driver(
            name = "Alexander Albon",
            raceNumber = "23",
            nationality = R.drawable.thailand,
            profilePicture = R.drawable.alex_albon,
            teamConstructor = "Williams",
            totalPodium = "2",
            totalPoints = "202",
            totalWorldChampionship = "N/A",
            biography = "Born in London but racing under the flag of Thailand, Alexander Albon’s first word was in fact Italian. That word was Ferrari – though it was with another Italian team that he got his big F1 break. Idolising Michael Schumacher and dreaming of one day racing in Formula 1, the junior Albon was pipped to the 2016 GP3 title by a certain Charles Leclerc. He then left his great friendship with George Russell trackside as he took the 2018 Formula 2 title fight down to the wire. Graduating to the F1 big league along with yet another contemporary – Lando Norris – in 2019, Albon did his talking on track with Toro Rosso in the opening races, earning a mid-season promotion to Red Bull Racing. A stylish over-taker with a championship mentality, Albon was unfazed by partnering Max Verstappen for the second half of his rookie season, taking top-six finishes in eight of his nine 2019 races with Red Bull."
        ),
        Driver(
            name = "Logan Sargeant",
            raceNumber = "2",
            nationality = R.drawable.usa,
            profilePicture = R.drawable.logan_sargeant,
            teamConstructor = "Williams",
            totalPodium = "N/A",
            totalPoints = "0",
            totalWorldChampionship = "N/A",
            biography = "Logan Sargeant becomes F1’s first American driver in almost eight years as he takes to the grid for the 2023 season, giving the country a home favourite to cheer once more. A prolific title winner in karting, championship glory eluded Sargeant after he made the transition to single-seater racing, but pole positions and race victories in almost every category he contested underlined his raw speed and potential. Indeed, finishing runner-up in F4 UAE, third in British F4 and third in F3 (having also made the podium at the prestigious Macau Grand Prix) showed he could be there or thereabouts in a variety of championships, with plenty of potential still to be untapped. It also convinced Williams to add the youngster to their books as he reached F2, where more race wins and another top-three classification in 2022 secured the Super Licence points required to complete the journey and graduate to F1 with the Grove team for 2023."
        )
    )
}