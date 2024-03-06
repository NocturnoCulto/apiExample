package pl.umk.allegroworkshop.apiExample.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import pl.umk.allegroworkshop.apiExample.api.model.Description;

import java.util.HashMap;
import java.util.Map;

@Service
public class DescriptionService {
    private final Map<String, Description> descriptionsMap = new HashMap<>();

    public Description getDescriptionById(String id) {
        return descriptionsMap.get(id);
    }

    @PostConstruct
    private void fillPersonMap() {
        descriptionsMap.put("123", new Description("123", "Hobbit - czyli tam i z powrotem", "Opowiada o wyprawie podjętej przez krasnoludów tworzących kompanię Thorina i towarzyszącego im hobbita o nazwisku Bilbo Baggins do zajmowanej przez smoka Smauga Samotnej Góry w celu odzyskania zagarniętych skarbów i dawnej siedziby krasnoludów.", 100));
        descriptionsMap.put("125", new Description("125", "3 tomy w jednym", "Wszystkie trzy części opowiadają o Wojnie o Pierścień z mitologii Śródziemia oraz o związanej z nią wędrówce hobbita Froda Bagginsa do Mordoru", 500));
        descriptionsMap.put("130", new Description("130", "Druga część trylogii Henryka Sienkiewicza", "Tekst opowiada losy Polski nękanej przez potop szwedzki. Bohaterem powieści jest Kmicic, odważny lecz naiwny i niebyt rozważny szlachcic, który zdradził kraj nie wiedząc nawet, że to czyni. Wybaczono mu te czyny. \"Potop\" to prawdziwe arcydzieło polskiej literatury.", 100));
        descriptionsMap.put("135", new Description("135", "Pierwsza część trylogii Henryka Sienkiewicza", "Tłem akcji są XVII-wieczne wydarzenia historyczne: konflikt polsko-ukraiński, powstanie Bohdana Chmielnickiego i wojny polsko-kozackie. Jan Skrzetuski, powracający z Krymu poseł księcia Jeremiego Wiśniowieckiego, przypadkiem ratuje życie kozackiemu pułkownikowi, Bohdanowi Chmielnickiemu.", 100));
        descriptionsMap.put("140", new Description("140", "I tom sagi", "Krew elfów opowiada o losach Geralta - wiedźmina, który opiekuje się dzieckiem-niespodzianką. Tym dzieckiem jest dziewczynka o imieniu Ciri. W prezentowanym tomie poznajemy też czarodziejkę Triss, która również ma wpływ na wychowanie dziecka.", 1000));
        descriptionsMap.put("145", new Description("145", "II tom sagi", "Nadchodzi zapowiadany wcześniej przez Intlinne czas miecza i topora. W tej części świat Ciri i Wiedźmina ogarniają płomienie. Na powierzchnię zaczynają wyłazić złowieszcze szczury, uwielbiające czynić zło.", 100));
        descriptionsMap.put("150", new Description("150", "III tom sagi", "Chrzest ognia to kontynuacja losów tytułowego zabójcy wampirów, kikimor i innych stworzeń czyhających na ludzkie życia. W tej części Geralt z Rivii wraz z Jaskrem nadal podąża tropem Ciri - magicznie uzdolnionej dziewczynki, z którą związany jest przeznaczeniem.", 100));
        descriptionsMap.put("155", new Description("155", "IV tom sagi", "Ranna i ledwo żywa Ciri zostaje odnaleziona na bagnach Pereplutu przez pustelnika Vysogotę z Corvo, który zaczyna się nią opiekować. Między młodą dziewczyną i starym wykładowcą oxenfurckiej uczelni stopniowo nawiązuje się przyjaźń. Cirilla postanawia opowiedzieć mu swoją historię.", 100));
        descriptionsMap.put("160", new Description("160", "V tom sagi", "Sapkowski przenosi nas do królestwa Aen Elle, do którego dostaje się jedna z głównych bohaterek - Ciri. Gdy jednak dowiaduje się, co czeka na nią w królestwie oraz czego oczekuje od niej Król Olch, dziewczyna postanawia uciec.", 5000));
    }

}
