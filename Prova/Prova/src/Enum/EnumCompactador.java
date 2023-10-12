package Enum;

import Compactador.CompactadorInterface;

public enum EnumCompactador implements CompactadorInterface {

    ZIP {

        @Override
        public void compactador(String arq) {
            System.out.println(arq + ".zip");

        }

    },
    RAR {

        @Override
        public void compactador(String arq) {
            System.out.println(arq + ".rar");
        }

    }
}
