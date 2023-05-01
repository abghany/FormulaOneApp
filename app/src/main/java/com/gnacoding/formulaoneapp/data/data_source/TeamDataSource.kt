package com.gnacoding.formulaoneapp.data.data_source

import com.gnacoding.formulaoneapp.R
import com.gnacoding.formulaoneapp.domain.model.Team

object TeamDataSource {
    val dummyTeams = listOf(
        Team(
            id = 1,
            teamCar = R.drawable.mercedes_car,
            teamLogo = R.drawable.mercedes_logo,
            name = "Mercedes-AMG",
            fullTeamName = "Mercedes-AMG PETRONAS F1 Team",
            base = "Brackley, United Kingdom",
            teamChief = "Toto Wolf",
            chassis = "W14",
            powerUnit = "Mercedes",
            totalWorldChampionship = "8",
            inProfile = "Mercedes’ modern F1 revival started with the creation of a works squad for 2010 - the platform for a meteoric rise up the Grand Prix order. The team generated huge excitement from the off with the sensational return of Michael Schumacher, but headlines soon followed on track: three podiums in their debut season, all via Nico Rosberg - who then claimed a breakthrough pole/victory double at China in 2012. The following season he was paired with Lewis Hamilton, the duo going on to stage some epic title battles as the Silver Arrows swept all before them to become one of the most dominant forces of the modern F1 era. And with Hamilton now partnered by the up-and-coming George Russell, Mercedes remain very much the team that everyone wants to beat."
        ),
        Team(
            id = 2,
            teamCar = R.drawable.red_bull_car,
            teamLogo = R.drawable.red_bull_logo,
            name = "Red Bull",
            fullTeamName = "Oracle Red Bull Racing",
            base = "Milton Keynes, United Kingdom",
            teamChief = "Christian Horner",
            chassis = "RB19",
            powerUnit = "Honda RBPT",
            totalWorldChampionship = "5",
            inProfile = "Red Bull were no strangers to F1 - as sponsors - prior to formally entering as a works team in 2004. Nonetheless, the scale of their success over the following decade was staggering. After a first podium in 2006, the team hit their stride in 2009, claiming six victories and second in the constructors' standings. Over the next four seasons they were a tour de force, claiming consecutive title doubles between 2010 and 2013, with Sebastian Vettel emerging as the sport's youngest quadruple champion. Now they are recapturing that glory with an equally exciting talent – one named Max Verstappen."
        ),
        Team(
            id = 3,
            teamCar = R.drawable.ferrari_car,
            teamLogo = R.drawable.ferrari_logo,
            name = "Ferrari",
            fullTeamName = "Scuderia Ferrari",
            base = "Maranello, Italy",
            teamChief = "Frédéric Vasseur",
            chassis = "SF-23",
            powerUnit = "Ferrari",
            totalWorldChampionship = "16",
            inProfile = "For many, Ferrari and Formula 1 racing have become inseparable. The only team to have competed in every season since the world championship began, the Prancing Horse has grown from the humble dream of founder Enzo Ferrari to become one of the most iconic and recognised brands in the world. Success came quickly through the likes of Alberto Ascari and John Surtees, and continued – in amongst leaner times – with Niki Lauda in the 1970s and then Michael Schumacher in the 2000s, when Ferrari claimed a then unprecedented five consecutive title doubles, securing their status as the most successful and decorated team in F1 history."
        ),
        Team(
            id = 4,
            teamCar = R.drawable.aston_martin_car,
            teamLogo = R.drawable.aston_martin_logo,
            name = "Aston Martin",
            fullTeamName = "Aston Martin Aramco Cognizant F1 Team",
            base = "Silverstone, United Kingdom",
            teamChief = "Mike Krack",
            chassis = "AMR23",
            powerUnit = "Mercedes",
            totalWorldChampionship = "N/A",
            inProfile = "Aston Martin’s original Formula 1 foray – over half a century ago – lasted just five races. This time, though, it’s serious. This F1 squad are no strangers to success, having won in their original guise of Jordan and most recently as Racing Point in 2020. Renowned for their ability to punch above their weight, and now with a two-time champion leading their driver line-up, Aston Martin are very much a team to watch."
        ),
        Team(
            id = 5,
            teamCar = R.drawable.mclaren_car,
            teamLogo = R.drawable.mclaren_logo,
            name = "McLaren",
            fullTeamName = "McLaren F1 Team",
            base = "Woking, United Kingdom",
            teamChief = "Andrea Stella",
            chassis = "MCL60",
            powerUnit = "Mercedes",
            totalWorldChampionship = "8",
            inProfile = "Since entering the sport in 1966 under the guidance and restless endeavour of eponymous founder Bruce, McLaren's success has been nothing short of breathtaking. Five glittering decades have yielded countless victories, pole positions and podiums, not to mention eight constructors' championships. What's more, some of the sport's greatest drivers made their names with the team, including Emerson Fittipaldi, Ayrton Senna, Mika Hakkinen and Lewis Hamilton."
        ),
        Team(
            id = 6,
            teamCar = R.drawable.alpine_car,
            teamLogo = R.drawable.alpine_logo,
            name = "Alpine",
            fullTeamName = "BWT Alpine F1 Team",
            base = "Enstone, United Kingdom",
            teamChief = "Otmar Szafnauer",
            chassis = "A523",
            powerUnit = "Renault",
            totalWorldChampionship = "2",
            inProfile = "Alpine may be a relatively new name to Formula 1, but Renault’s famous sportscar arm has plenty of motorsport heritage. The 2021 rebrand of the team marked the next step in Renault’s F1 revival, begun in 2016 with the takeover of the then-Lotus squad. Already race winners in their new guise, regular podiums and a tilt at the title must be their next target."
        ),
        Team(
            id = 7,
            teamCar = R.drawable.haas_car,
            teamLogo = R.drawable.haas_logo,
            name = "Haas",
            fullTeamName = "MoneyGram Haas F1 Team",
            base = "Kannapolis, United States",
            teamChief = "Guenther Steiner",
            chassis = "VF-23",
            powerUnit = "Ferrari",
            totalWorldChampionship = "N/A",
            inProfile = "The youngest team on the grid, Haas made their highly impressive debut in 2016, and in the process became the first all-American-led F1 squad in three decades. Founded by industrialist Gene Haas, they are based in the United States on the same Kannapolis, North Carolina facility as his championship-winning NASCAR Sprint Cup Series team, Stewart-Haas Racing. The Ferrari-powered team, led by the charismatic Guenther Steiner, also have a UK factory in Banbury."
        ),
        Team(
            id = 8,
            teamCar = R.drawable.williams_car,
            teamLogo = R.drawable.williams_logo,
            name = "Williams",
            fullTeamName = "Williams Racing",
            base = "Grove, United Kingdom",
            teamChief = "James Vowles",
            chassis = "FW45",
            powerUnit = "Mercedes",
            totalWorldChampionship = "9",
            inProfile = "Driven on by the brilliance and passion of the late Sir Frank Williams, Williams grew from humble beginnings to become a Formula 1 behemoth, unrivalled by all except Ferrari and McLaren in terms of enduring success. Over the past four decades the team has racked up Grand Prix wins and championship glory, and in the process nurtured some of the greatest talents in the sport, both in and out the cockpit. And, following the Williams family's decision to step aside after the 2020 sale of the team to Dorilton Capital, a new era has begun."
        ),
        Team(
            id = 9,
            teamCar = R.drawable.alfa_romeo_car,
            teamLogo = R.drawable.alfa_romeo_logo,
            name = "Alfa Romeo",
            fullTeamName = "Alfa Romeo F1 Team Stake",
            base = "Hinwil, Switzerland",
            teamChief = "Alessandro Alunni Bravi",
            chassis = "C43",
            powerUnit = "Ferrari",
            totalWorldChampionship = "N/A",
            inProfile = "The name Alfa Romeo boasts Formula 1 connections dating back to the championship’s inception in 1950. Fast forward to the 21st century and Italian flare combines with Swiss sensibilities in a new era for the team formerly known as Sauber. Having enjoyed considerable success in world sportscars, where he helped nurture the emerging talents of future F1 stars Michael Schumacher and Heinz-Harald Frentzen, Peter Sauber guided his eponymous squad into F1 in 1993. The team has since established itself as a mainstay of the grid, becoming race winners under BMW’s brief ownership, and developing a well-earned reputation not only for producing competitive cars, but also for developing young drivers."
        ),
        Team(
            id = 10,
            teamCar = R.drawable.alphatauri_car,
            teamLogo = R.drawable.alphatauri_logo,
            name = "Alphatauri",
            fullTeamName = "Scuderia AlphaTauri",
            base = "Faenza, Italy",
            teamChief = "Franz Tost",
            chassis = "AT04",
            powerUnit = "Honda RBPT",
            totalWorldChampionship = "N/A",
            inProfile = "Established in 2006 as a squad in which young drivers from Red Bull’s prodigious talent pool could cut their F1 teeth, AlphaTauri – originally named Toro Rosso – were formed from the ashes of the plucky Minardi team. Sebastian Vettel gave validity to the approach almost immediately, delivering a fairy-tale win in 2008, before going on to enjoy world championship success with parent team Red Bull Racing. Today the ethos of nurturing talent still holds true, though the Italian squad are no longer simply a ‘B team’ but a constructor in their own right."
        ),
    )
}