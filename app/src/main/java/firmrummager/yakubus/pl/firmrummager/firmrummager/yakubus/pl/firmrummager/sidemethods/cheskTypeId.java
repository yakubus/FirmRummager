package firmrummager.yakubus.pl.firmrummager.firmrummager.yakubus.pl.firmrummager.sidemethods;


import java.io.IOException;

import firmrummager.yakubus.pl.firmrummager.dataModel;

/**
 * Jakub Garbacz
 * veryfication taype ID (nip, regon, krs)
 */
public class cheskTypeId  {
    public String checkId(dataModel data) throws IOException {
        if(data.getInputId().length()==10){
            data.setNip(data.getInputId());
            return "n";
        }else if (data.getInputId().length()==10){
            data.setRegon(data.getInputId());
            return "r";
        }else{
            data.setNip("");
            data.setRegon("");
            return "";
        }
    }
}
