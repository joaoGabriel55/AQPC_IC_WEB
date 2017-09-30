package model;

public enum TecnicasCoccao {
		CONDUCAO,CONVECCAO,GRELHAR,ASSAR,GUISAR,BRASEAR,SALTEAR,CALOR_SECO,CALOR_UMIDO,FRITAR,REFOGAR,RADIACAO;
		
		private String tipoTecnica;

		public String getTipoTecnica() {
			return tipoTecnica;
		}

		public void setTipoTecnica(String tipoTecnica) {
			this.tipoTecnica = tipoTecnica;
		}
}
